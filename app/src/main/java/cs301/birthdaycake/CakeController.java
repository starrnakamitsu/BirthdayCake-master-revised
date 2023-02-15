package cs301.birthdaycake;

import android.util.AttributeSet;
import android.view.View;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView view;
    private CakeModel model;
    private boolean lit;

    // constructor
    public CakeController(CakeView view){
        this.view = view;
        this.model = view.getModel();
    }

    public void onClick(View v){
        Log.d("anything", "you want");

        model.setLit(false);
        view.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        Log.d("ur", "mother");

        model.setCandles(!model.getCandles());
        view.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        Log.d("ur", "father");

        model.setNumCandles(i);

        view.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
