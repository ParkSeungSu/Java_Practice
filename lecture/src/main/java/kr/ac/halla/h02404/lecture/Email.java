package kr.ac.halla.h02404.lecture;

public class Email {
	private Integer from;
	private Integer to;
	public Email(Integer f, Integer t) {
		this.from=f;
		this.to=t;
	}
	public Integer getFrom() {
		return from;
	}
	public void setFrom(Integer from) {
		this.from = from;
	}
	public Integer getTo() {
		return to;
	}
	public void setTo(Integer to) {
		this.to = to;
	}
	
}
