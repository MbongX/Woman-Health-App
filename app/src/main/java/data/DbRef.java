package data;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DbRef {
    //creating the database ref class to access firebase's database's realtime database
    public static DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://wmalogin-3a3ea-default-rtdb.firebaseio.com/");
    public final static String DbName = "Users";



}
