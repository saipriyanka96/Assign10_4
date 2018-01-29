package com.example.layout.assign10_4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentTab2 extends Fragment {
//A Fragment is a piece of an application's user interface or behavior that can be placed in an Activity . Interaction with fragments is done through FragmentManager ,
// which can be obtained via Activity.getFragmentManager() and Fragment.getFragmentManager() .

    public FragmentTab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Called to have the fragment instantiate its user interface view. This is optional, and non-graphical fragments can return null (which is the default implementation)
        // Inflate the layout for this fragment
        //inflater	LayoutInflater: The LayoutInflater object that can be used to inflate any views in the fragment,
       // container	ViewGroup: If non-null, this is the parent view that the fragment's UI should be attached to. The fragment should not add the view itself, but this can be used to generate the LayoutParams of the view.
        //savedInstanceState	Bundle: If non-null, this fragment is being re-constructed from a previous saved state as given here.
//Returns
        //View	Return the View for the fragment's UI, or null.
        View rootView=inflater.inflate(R.layout.fragment_tab2, container, false);
        return rootView;
    }

}
