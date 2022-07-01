package task.model;

public class Task {
	private int todoId;
	private String title;
	private String description;
	private String categoryId;
	private String status;
	private String deadline;
	
	public Task() {
		super();
	}
	
	public Task(String title, String description, String categoryId, String status, String deadline) {
		super();
		this.title = title;
		this.description = description;
		this.categoryId = categoryId;
		this.status = status;
		this.deadline = deadline;
	}
	
	public Task(int todoId, String title, String description, String categoryId, String status, String deadline) {
		super();
		this.todoId = todoId;
		this.title = title;
		this.description = description;
		this.categoryId = categoryId;
		this.status = status;
		this.deadline = deadline;
	}
	public int getTodoId() {
		return todoId;
	}
	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	@Override
	public String toString() {
		return "TodoList [todoId=" + todoId + ", title=" + title + ", description=" + description + ", categoryId="
				+ categoryId + ", status=" + status + ", deadline=" + deadline + "]";
	}
	
	
}
