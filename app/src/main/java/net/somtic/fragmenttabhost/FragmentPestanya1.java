package net.somtic.fragmenttabhost;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Salva on 14/04/2016.
 */
public class FragmentPestanya1 extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.pestanya1_layout,
                container, false);
        TextView tv = (TextView) v.findViewById(R.id.text);
        Resources res = getResources();
        tv.setText(res.getString(R.string.eti_tab1));
        return v;
    }
}