package kr.ac.halla.h02404.FileInputOutput;

/**
 * 
 * @author 어떤 사람이 얼마나 나오나
 *
 */
public class Frequence {
	private Integer id;
	private Integer frequece;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFrequece() {
		return frequece;
	}

	public void setFrequece(Integer frequece) {
		this.frequece = frequece;
	}

	@Override
	public String toString() {
		return this.id + "\n" + this.frequece;
	}

	public Frequence(int d, int count) {
		super();
		this.id = d;
		this.frequece = count;
	}
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (this.id == ((Frequence) obj).id) {
			return true;
		} else {
			return false;
		}
	}

}
