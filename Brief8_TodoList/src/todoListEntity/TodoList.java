package todoListEntity;

public class TodoList {
	private int todoId;
	private String title;
	private String description;
	private String status;
	private String deadline;
	private int categoryId;
	public TodoList() {
		super();
	}
	public TodoList(int todoId, String title, String description, String status, String deadline, int categoryId) {
		super();
		this.todoId = todoId;
		this.title = title;
		this.description = description;
		this.status = status;
		this.deadline = deadline;
		this.categoryId = categoryId;
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
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "TodoList [todoId=" + todoId + ", title=" + title + ", description=" + description + ", status=" + status
				+ ", deadline=" + deadline + ", categoryId=" + categoryId + "]";
	}
	
}
