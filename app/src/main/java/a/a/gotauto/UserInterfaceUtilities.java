package a.a.gotauto;
import android.content.Context;
import android.graphics.Color;
import android.text.InputType;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class UserInterfaceUtilities {

  private Context context;

  UserInterfaceUtilities(Context context){
    this.context = context;
  }

  public Button generateButtonWT(int buttonText) {
    final Button button = new Button(context);
    ViewTreeObserver vto = button.getViewTreeObserver();
    vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
      public boolean onPreDraw() {
        button.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
      }
    });
    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
        LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    lp.setMargins(20, 10, 20, 10);
    button.setLayoutParams(lp);
    button.setTextColor(Color.WHITE);
   /// button.setBackground();
    button.setPadding(20, 20, 20, 20);
    button.setTextSize(14);
    button.setCompoundDrawablePadding(5);
    button.setText(buttonText);
    return button;
  }
  public Button generateButton(int buttonText) {
    final Button button = new Button(context);
    ViewTreeObserver vto = button.getViewTreeObserver();
    vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
      public boolean onPreDraw() {
        button.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
      }
    });
    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
        LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    lp.setMargins(20, 10, 20, 10);
    button.setLayoutParams(lp);
    button.setTextColor(Color.BLACK);
    button.setPadding(20, 20, 20, 20);
    button.setTextSize(14);
    button.setCompoundDrawablePadding(5);
    return button;
  }

  public EditText generateEditText(){
    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
        LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    lp.setMargins(20, 13, 20, 12);
   EditText editText = new EditText(context);
   editText.setTextAppearance(context,R.style.Widget_AppCompat_EditText);
   editText.setLayoutParams(lp);
   editText.setFocusable(false);
   editText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
   return editText;
  }

}
