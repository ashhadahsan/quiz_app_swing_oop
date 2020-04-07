import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class StoreData  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void addtoList(User user) {
		
		
		ObjectOutputStream out=null;
		try {
	        // Read old objects
	ArrayList<User>UserList = readAllData();
	// Append new object into existing list
	UserList.add(user);
	// Open Stream for writing
	out = new ObjectOutputStream(new FileOutputStream("user.txt"));

	// Write all objects (old and new one) into the file
	for(int i = 0 ; i<UserList.size() ; i++) {
		out.writeObject(UserList.get(i));
	}
	} catch(IOException exp) {
	System.out.println("IO Exception while opening file");
	} finally { // cleanup code which closes output stream if its object was created
	try {
		if(out != null) {
			out.close();
			// flag of success
			
		}

	} catch (IOException exp)
	{
		System.out.println("IO Exception while closing file");
	}
	}
			}

		
		
	
	


public ArrayList<User> readAllData(){
	ArrayList<User> UserList = new ArrayList<User>(0);
	// Input stream

	ObjectInputStream inputStream = null;
	try
	{
	// open file for reading
	inputStream = new ObjectInputStream(new FileInputStream("user.txt"));
	// End Of File flag

	boolean EOF = false;
	// Keep reading file until file ends
	while(!EOF) {
	try {
	// read object and type cast into CarDetails object
	User myObj = (User) inputStream.readObject();
	// add object into ArrayList
	UserList.add(myObj);

	} 
	catch (ClassNotFoundException e) {
	System.out.println("Class not found");
	} 
	catch (EOFException end) 
	{
	EOF = true;
	}
	}
	} catch(FileNotFoundException e) {
	System.out.println("Cannot find file");
	} catch (IOException e) {
	System.out.println("IO Exception while opening stream");
	e.printStackTrace();
	} finally { // cleanup code to close stream if it was opened
	try {
	if(inputStream != null)
	inputStream.close( );
	} catch (IOException e) {
	// TODO Auto-generated catch block
	System.out.println("IO Exception while closing file");
	}
	}
	// returns ArrayList
	return UserList;
		
		
	}
	
}
