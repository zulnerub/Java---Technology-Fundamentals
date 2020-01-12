public class Articles {
	private String title;
	private String content;
	private String author;
	
	
	public Articles (String title, String content, String author) {
		this.setTitle(title);
		this.setContent(content);
		this.setAuthor(author);
	}

	public String toString() {
		return String.format("%s - %s: %s", 
				this.title,
				this.content,
				this.author
				);
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
}
