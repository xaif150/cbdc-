package com.cbdc.instagram_login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUp_activity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_activity);
mAuth=FirebaseAuth.getInstance();

}
@Override
public void onStart() {
    super.onStart();
    FirebaseUser currentUser = mAuth.getCurrentUser();
    updateUI(currentUser);
}

    private void updateUI(FirebaseUser currentUser) {

    }

    public void loginm(View v){
        EditText phn = (EditText) findViewById(R.id.phone);
        String phnn= phn.toString().trim();
        EditText pass = (EditText) findViewById(R.id.sign_pass);
        String passs= pass.toString().trim();
        if(phnn.isEmpty())
        {phn.setError("email not found");
            phn.requestFocus();
            return;
        }
        registerUser(phnn,passs);
    }
    private void registerUser(String phnn, String passs) {
mAuth.createUserWithEmailAndPassword(phnn,passs)
        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    FirebaseUser user = mAuth.getCurrentUser();
                    Intent i = new Intent(getApplicationContext(), loged.class);
                    startActivity(i);
                        

            }
        }
    });
    }
    }
