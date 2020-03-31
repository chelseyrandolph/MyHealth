package com.example.myhealth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.myhealth.ui.lifestyle.ExerciseLogActivity;
import com.example.myhealth.ui.lifestyle.FoodWaterLogActivity;
import com.example.myhealth.ui.lifestyle.GoalNoteLogActivity;
import com.example.myhealth.ui.lifestyle.WeightLogActivity;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LifestyleFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LifestyleFragment} factory method to
 * create an instance of this fragment.
 */
public class LifestyleFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private OnFragmentInteractionListener mListener;

    public LifestyleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     */
    // TODO: Rename and change types and number of parameters
    public static LifestyleFragment nutrientLog(String fluid, double volume, String food, double calories) {
        LifestyleFragment fragment = new LifestyleFragment();
        Bundle args = new Bundle();
        String s = Double.toString(volume);
        String t = Double.toString(calories);
        args.putString(fluid, s);
        args.putString(food, t);
        fragment.setArguments(args);
        return fragment;
    }
    public static LifestyleFragment exerciseLog(String movement, int sets, int reps) {
        LifestyleFragment fragment = new LifestyleFragment();
        Bundle args = new Bundle();
        String c = Integer.toString(sets);
        String v = Integer.toString(reps);
        String a = c + v;
        args.putString(a, movement);
        fragment.setArguments(args);
        return fragment;
    }
    public static LifestyleFragment weightLog(int weight) {
        LifestyleFragment fragment = new LifestyleFragment();
        Bundle args = new Bundle();
        String i = Integer.toString(weight);
        args.putString(i, " ");
        fragment.setArguments(args);
        return fragment;
    }
    public static LifestyleFragment goalLog(String goal, double date, String description) {
        LifestyleFragment fragment = new LifestyleFragment();
        Bundle args = new Bundle();
        String c = Double.toString(date);
        String a = c + description;
        args.putString(goal, a);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lifestyle, container, false);
        String[] options = {"Food/Water Log", "Exercise Log", "Weight Log", "Goal Log"};

        ListView listView = view.findViewById(R.id.lifestyleMenuItems);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                options);

        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(view.getContext(), FoodWaterLogActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent2 = new Intent(view.getContext(), ExerciseLogActivity.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(view.getContext(), WeightLogActivity.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(view.getContext(), GoalNoteLogActivity.class);
                        startActivity(intent4);
                        break;
                }
            }

        });
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        return view;

    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_lifestyle,menu);
    }
    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

/*    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
