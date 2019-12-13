package stevani.siska.prediksibanjirlahar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentButton extends Fragment {

    View view;
    Button beranda, gendol, putih1,putih2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.activity_fragment_button, container, false);

        beranda = view.findViewById(R.id.buttonBeranda);
        gendol = view.findViewById(R.id.buttonGendol);
        putih1 = view.findViewById(R.id.buttonPutih1);
        putih2 = view.findViewById(R.id.buttonPutih2);

        gendol.setVisibility(View.INVISIBLE);
        putih1.setVisibility(View.INVISIBLE);
        putih2.setVisibility(View.INVISIBLE);

        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gendol.setVisibility(View.VISIBLE);
                putih1.setVisibility(View.VISIBLE);
                putih2.setVisibility(View.VISIBLE);

                gendol.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.frame2,new FragmentResult());
                        ft.commit();
                    }
                });
            }
        });
        return view;
    }
}
