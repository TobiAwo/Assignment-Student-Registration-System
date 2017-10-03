package Assignment.RegSystem;

import org.junit.Test;
import junit.framework.TestCase;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class studentTest extends TestCase {
    public Student studentTest;
    private LocalDate dateB = new LocalDate(1996,07,16);
	private DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/YYYY");
	private String strDateOnly = fmt.print(dateB);
	private LocalDate dateDOB = LocalDate.parse(strDateOnly, fmt);
    private String usernameExpected = "tobiawoponle21";

    //Test user name
	@Test
    public void testGetUsername()
    {
		studentTest = new Student("Tobi Awoponle", 21, dateDOB,"14335486", null);
        String usernameRec = studentTest.getUsername();

        assertEquals(usernameExpected, usernameRec);

    }
	//Test user name in toString
    @Test
    public void testToString()
    {
		studentTest = new Student("Tobi Awoponle", 21, dateDOB,"14335486",null);
        String StringExpected = "Student Name: Tobi Awoponle\n" + 
        		"Student Age: 21\n" + 
        		"Student DOB: 1996-07-16\n" + 
        		"Student ID: 14335486\n" + 
        		"Student Username: " + usernameExpected;
        String stringRec = studentTest.toString();

        assertEquals(StringExpected, stringRec);

    }


}
