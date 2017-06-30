package upwork.andri.productlisting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class SignUpActivity extends AppCompatActivity {
    private Unbinder unbinder;

    @OnClick(R.id.btn_signup) void SignUp(){
        Toast.makeText(this, "Sign up clicked", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.login_text) void goToLogin(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        unbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
