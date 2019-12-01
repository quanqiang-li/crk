package liqq.crk.common;

public enum Code {

	OK(0, "成功"), 
	
	GLOBAL_ERROR(9000, "全局异常"), 
	SYS_ERROR(9999, "系统异常");
	
	private int key;
	private String value;

	private Code(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int key() {
		return this.key;
	}

	public String value() {
		return this.value;
	}

}
