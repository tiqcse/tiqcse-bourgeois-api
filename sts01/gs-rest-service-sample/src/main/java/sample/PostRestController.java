package sample;

import java.util.*;

import org.modelmapper.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
class PostRestController {

	@Autowired
	private IPostService postService;

	@Autowired
	private IUserService userService;

	@Autowired
	private ModelMapper modelMapper;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<PostDto> getPosts(...) {
		//...
		List<Post> posts = postService.getPostsList(page, size, sortDir, sort);
		return posts.stream()
			.map(post -> convertToDto(post))
			.collect(Collectors.toList());
	}
	 
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public PostDto createPost(@RequestBody PostDto postDto) {
		Post post = convertToEntity(postDto);
		Post postCreated = postService.createPost(post));
	    return convertToDto(postCreated);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public PostDto getPost(@PathVariable("id") Long id) {
		return convertToDto(postService.getPostById(id));
	}
	 
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void updatePost(@RequestBody PostDto postDto) {
		Post post = convertToEntity(postDto);
		postService.updatePost(post);
	}
}
