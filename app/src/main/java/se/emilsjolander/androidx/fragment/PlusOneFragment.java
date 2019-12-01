package se.emilsjolander.androidx.fragment;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import se.emilsjolander.androidx.R;

/**
 * A fragment with a Google +1 button.
 */
public class PlusOneFragment extends Fragment {

    private static final String TAG = "PlusOneFragment";
    // The request code must be 0 or greater.
    private static final int PLUS_ONE_REQUEST_CODE = 0;
    // The URL to +1.  Must be a valid URL.
    private final String PLUS_ONE_URL = "http://developer.android.com";


    private int type = 0;

    public PlusOneFragment() {
        // Required empty public constructor
    }

    public static PlusOneFragment newInstance(int type) {

        Bundle args = new Bundle();
        args.putInt("type", type);
        PlusOneFragment fragment = new PlusOneFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        type = getArguments().getInt("type");
        Log.i(TAG, "onCreate: " + type);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_plus_one, container, false);

        //Find the +1 button
     //   mPlusOneButton = (PlusOneButton) view.findViewById(R.id.plus_one_button);


        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: " + type);
    }

    @Override
    public void onResume() {
        super.onResume();

        // Refresh the state of the +1 button each time the activity receives focus.
     //   mPlusOneButton.initialize(PLUS_ONE_URL, PLUS_ONE_REQUEST_CODE);
        Log.i(TAG, "onResume: " + type);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: "+type);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: " + type);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: " + type);
    }
}
