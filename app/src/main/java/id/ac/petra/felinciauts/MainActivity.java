package id.ac.petra.felinciauts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHandler dbHandler = new DBHandler(this);
        dbHandler.addContact(new User("D12200034", "Felincia", "071002", "AppDevelopment", "061023"));
        dbHandler.addContact(new User("D12200034", "Felincia", "071002", "AppDevelopment", "061023"));
        dbHandler.addContact(new User("D12200034", "Felincia", "071002", "AppDevelopment", "061023"));
        Log.d("SQLite", "Membaca isi database");
        List<User> contacts = dbHandler.getAllContacts();
        for (User c: contacts){
            String m = "ID: "+c.getID()+ " Username: "+c.getUsername()+ " Password: "+c.getPassword()+
                    "Task: "+c.getTask()+ "DueDate: "+c.getDueDate();
            Log.d("SQLite",m);
        }
    }


}