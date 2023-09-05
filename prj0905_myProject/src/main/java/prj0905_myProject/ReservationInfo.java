package prj0905_myProject;

public class ReservationInfo {

	String id;
	String pw;
	String name;
	String phone;
	String r_num;
	String o_id;
	String o_code;
	int o_cnt;
	String m_code;
	String m_title;
	String m_genre;
	int m_price;
	String m_runtime;
	String m_start_end;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getR_num() {
		return r_num;
	}
	public void setR_num(String r_num) {
		this.r_num = r_num;
	}
	public String getO_id() {
		return o_id;
	}
	public void setO_id(String o_id) {
		this.o_id = o_id;
	}
	public String getO_code() {
		return o_code;
	}
	public void setO_code(String o_code) {
		this.o_code = o_code;
	}
	public int getO_cnt() {
		return o_cnt;
	}
	public void setO_cnt(int o_cnt) {
		this.o_cnt = o_cnt;
	}
	public String getM_code() {
		return m_code;
	}
	public void setM_code(String m_code) {
		this.m_code = m_code;
	}
	public String getM_title() {
		return m_title;
	}
	public void setM_title(String m_title) {
		this.m_title = m_title;
	}
	public String getM_genre() {
		return m_genre;
	}
	public void setM_genre(String m_genre) {
		this.m_genre = m_genre;
	}
	public int getM_price() {
		return m_price;
	}
	public void setM_price(int m_price) {
		this.m_price = m_price;
	}
	public String getM_runtime() {
		return m_runtime;
	}
	public void setM_runtime(String m_runtime) {
		this.m_runtime = m_runtime;
	}
	public String getM_start_end() {
		return m_start_end;
	}
	public void setM_start_end(String m_start_end) {
		this.m_start_end = m_start_end;
	}
	
	public ReservationInfo(String id, String pw, String name, String phone, String r_num, String o_id, String o_code,
			int o_cnt, String m_code, String m_title, String m_genre, int m_price, String m_runtime,
			String m_start_end) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.r_num = r_num;
		this.o_id = o_id;
		this.o_code = o_code;
		this.o_cnt = o_cnt;
		this.m_code = m_code;
		this.m_title = m_title;
		this.m_genre = m_genre;
		this.m_price = m_price;
		this.m_runtime = m_runtime;
		this.m_start_end = m_start_end;
	}
	
	
	@Override
	public String toString() {
		return "ReservationInfo [id=" + id + ", pw=" + pw + ", name=" + name + ", phone=" + phone + ", r_num=" + r_num
				+ ", o_id=" + o_id + ", o_code=" + o_code + ", o_cnt=" + o_cnt + ", m_code=" + m_code + ", m_title="
				+ m_title + ", m_genre=" + m_genre + ", m_price=" + m_price + ", m_runtime=" + m_runtime
				+ ", m_start_end=" + m_start_end + "]";
	}
	
	

}
