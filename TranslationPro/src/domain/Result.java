package domain;

import java.util.Map;
//创建这个java，是为了更好的利用gson解析json数据，
//{"from":"zh","to":"en","trans_result":[{"src":"\u82f9\u679c","dst":"Apple"}]}
//value 是对象时，对应在java类中就是map（k-v对）了。value 是数组时（hobbies），对应在java类中也是数组。
public class Result {
	private String from;
	private String to;
	private Map<String ,String> trans_result;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Map<String, String> getTrans_result() {
		return trans_result;
	}
	public void setTrans_result(Map<String, String> trans_result) {
		this.trans_result = trans_result;
	}
	public Result(String from, String to, Map<String, String> trans_result) {
		super();
		this.from = from;
		this.to = to;
		this.trans_result = trans_result;
	}
	
}
