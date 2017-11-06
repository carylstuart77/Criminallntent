package com.bignerdranch.android.criminallntent;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_crime);


    //Call the fragment_crime.xml screen.  Replacing activity_crime.xml
//TODO: I don't know if variable is of the correct type. Used v4 import.
    FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.Fragment fragment = fm.findFragmentById(R.id.fragment_container);

    if(fragment == null) {
      fragment = new CrimeFragment();
      fm.beginTransaction()
          .add(R.id.fragment_container, fragment)
          .commit();
    }
  }
}
