package cs301.birthdaycake;

import android.view.View;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements SeekBar.OnSeekBarChangeListener, View.OnClickListener, CompoundButton.OnCheckedChangeListener{
    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView view) {
        this.cakeView = view;
        this.cakeModel = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View v) {
        cakeModel.isLit = false;
        cakeView.invalidate();

        Log.d("CakeController", "Blow Out button clicked");
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        // Modify the model based on the checked state
        cakeModel.hasCandles = isChecked;

        // Notify the CakeView to redraw itself
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakeModel.numCandles = progress;
        cakeView.invalidate(); // Trigger a redraw
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // Do nothing
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // Do nothing
    }



}
