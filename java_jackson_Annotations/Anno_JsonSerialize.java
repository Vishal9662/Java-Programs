package java_jackson_Annotations;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class Anno_JsonSerialize {

	public static void main(String[] args) throws ParseException, JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		
		U7 u=new U7(1, "Vishal", dateFormat.parse("14-10-2002"));
		
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u);
		
		System.out.println(json);
	}
}


class U7{
	private int id;
	private String name;
	@JsonSerialize(using=CustomDateSerializer.class)
	private Date dob;
	
	public U7(int id, String name, Date dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	
}

class CustomDateSerializer extends StdSerializer<Date>
{

	private static final long serialVersionUID = 1L;
	
	SimpleDateFormat format=new SimpleDateFormat();
	
	public CustomDateSerializer() {
		this(null);
	}

	public CustomDateSerializer(Class<Date> t) {
		super(t);
	}

	@Override
	public void serialize(Date value, JsonGenerator generator, SerializerProvider arg2) throws IOException {

		generator.writeString(format.format(value));
		
	}
	
}