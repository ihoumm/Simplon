package todoListEntity;

public class TodoList {
	private int todoId, categoryId;
	private String title, description, status, deadline;
	public TodoList() {
		super();
	}
	public TodoList(int todoId, int categoryId, String title, String description, String status, String deadline) {
		super();
		this.todoId = todoId;
		this.categoryId = categoryId;
		this.title = title;
		this.description = description;
		this.status = status;
		this.deadline = deadline;
	}
	public int getTodoId() {
		return todoId;
	}
	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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
	@Override
	public String toString() {
		return "TodoList [todoId=" + todoId + ", categoryId=" + categoryId + ", title=" + title + ", description="
				+ description + ", status=" + status + ", deadline=" + deadline + "]";
	}
	
}
