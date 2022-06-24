package todoListEntity;

public class TodoList {
	private int todoId;
	private String title;
	private String description;
	private int categoryId;
	private String status;
	private String deadline;
	
	
	public TodoList() {
		super();
	}
	public TodoList(int todoId, String title, String description, int categoryId, String status, String deadline) {
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
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
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
