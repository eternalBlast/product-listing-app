package upwork.andri.productlisting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import upwork.andri.productlisting.model.Product;

public class ProductListingActivity extends AppCompatActivity {

    private Unbinder unbinder;

    @BindView(R.id.rv_item_product)
    protected RecyclerView mItemProductRV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_listing);
        unbinder = ButterKnife.bind(this);
        ProductAdapter itemOrderAdapter = new ProductAdapter(this, Product.createProductItems());
        mItemProductRV.setAdapter(itemOrderAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
