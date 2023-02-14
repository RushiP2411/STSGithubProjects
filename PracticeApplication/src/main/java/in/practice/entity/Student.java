package in.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "STUDENT")
@Data
public class Student {

	@Id
	@Column(name = "STUD_NO")
	private Integer studNo;
	
	@Column(name = "STUD_NAME")
	private String studName;
	
	@Column(name = "STUD_ADRS")
	private String studAddrs;
	
	@Column(name = "STUD_COURSE")
	private String studCourse;

}
