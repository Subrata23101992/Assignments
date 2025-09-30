package language.array.Assignments;

public class Assignment2 {

	public static void main(String[] args) 
	{
		
		// 5 semester ,6 subjects and 6 status (pass/fail and mark).Hence, a 3D array of size [5][6][6] is created
		
		String Student[][][]= new String[5][6][6];
		 
		
				//Sem1
				Student[0][0][0] = "Mathematics I";
				Student[0][0][1] = "Physics";
				Student[0][0][2] = "Chemistry";
				Student[0][0][3] = "Computer Programming";
				Student[0][0][4] = "ED";
				Student[0][0][5] = "Basic Electrical Eng.";
				
				//marks
				Student[0][1][0] = "Pass(78)";
				Student[0][1][1] = "Pass(85)";
				Student[0][1][2] = "Fail(21)";
				Student[0][1][3] = "Pass(74)";
				Student[0][1][4] = "Pass(88)";
				Student[0][1][5] = "Pass(79)";

				// Sem 2
				Student[1][0][0] = "Mathematics II";
				Student[1][0][1] = "Mechanics";
				Student[1][0][2] = "Environmental Sci.";
				Student[1][0][3] = "Basic Electronics";
				Student[1][0][4] = "Engineering Physics";
				Student[1][0][5] = "Engineering Graphics";
				//marks
				Student[1][1][0] = "Pass(82)";
				Student[1][1][1] = "Pass(77)";
				Student[1][1][2] = "Pass(93)";
				Student[1][1][3] = "Fail(19)";
				Student[1][1][4] = "Fail(24)";
				Student[1][1][5] = "Pass(90)";

				// Sem 3
				Student[2][0][0] = "Data Structures";
				Student[2][0][1] = "Discrete Mathematics";
				Student[2][0][2] = "Digital Electronics";
				Student[2][0][3] = "Operating Systems";
				Student[2][0][4] = "Signals and Systems";
				Student[2][0][5] = "Object-Oriented Prog.";
				//marks
				Student[2][1][0] = "Pass(88)";
				Student[2][1][1] = "Pass(81)";
				Student[2][1][2] = "Pass(76)";
				Student[2][1][3] = "Fail(32)";
				Student[2][1][4] = "Pass(85)";
				Student[2][1][5] = "Pass(78)";

				// Sem 4
				Student[3][0][0] = "Algorithms";
				Student[3][0][1] = "Computer Networks";
				Student[3][0][2] = "Database Systems";
				Student[3][0][3] = "Microprocessors";
				Student[3][0][4] = "Communication Eng.";
				Student[3][0][5] = "Software Engineering";
				//marks
				Student[3][1][0] = "Pass(91)";
				Student[3][1][1] = "Pass(73)";
				Student[3][1][2] = "Fail(19)";
				Student[3][1][3] = "Pass(80)";
				Student[3][1][4] = "Pass(76)";
				Student[3][1][5] = "Pass(87)";

				// Sem 5
				Student[4][0][0] = "Probability & Stats";
				Student[4][0][1] = "Machine Learning";
				Student[4][0][2] = "Compiler Design";
				Student[4][0][3] = "Theory of Computation";
				Student[4][0][4] = "Embedded Systems";
				Student[4][0][5] = "Computer Graphics";
				//marks
				Student[4][1][0] = "Pass(86)";
				Student[4][1][1] = "Pass(88)";
				Student[4][1][2] = "Pass(84)";
				Student[4][1][3] = "Pass(95)";
				Student[4][1][4] = "Pass(73)";
				Student[4][1][5] = "Pass(90)";

		//Print Semester 2 Subject 4 and Subject 5 names. 
		
		System.out.println("Semester_2  subject 4 and subject 5 : ");
		System.out.println("Subject 4 :" + Student[1][0][3]);
		System.out.println("Subject 5 :"+ Student[1][0][4] );
		
		//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		
		System.out.println("Semester_4  subject 3 and subject 6 marks : ");
		System.out.println("Subject 3 :" + Student[3][1][2]);
		System.out.println("Subject 6 :"+ Student[3][1][5] );
		
				
				

	}

}
