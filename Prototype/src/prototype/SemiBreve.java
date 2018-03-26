package prototype;
public class SemiBreve implements Note{

	@Override
	public Note clone() throws CloneNotSupportedException {
		return (SemiBreve) super.clone();
	}

}
