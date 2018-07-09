package sample;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;

public class PostService {

	public List<Post> getPostsList(
		int page, int size, String sortDir, String sort) {

		PageRequest pageReq = new PageRequest(page, size, Sort.Direction.fromString(sortDir), sort);

		Page<Post> posts = postRepository.findByUser(userService.getCurrentUser(), pageReq);
		return posts.getContent();
	}
	
}
