package upwork.andri.productlisting;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import upwork.andri.productlisting.model.Product;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<Product> mItemOrders;
    private Context mContext;

    public ProductAdapter(Context context, List<Product> itemOrders) {
        mContext = context;
        mItemOrders = itemOrders;
    }

    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemOrderView = inflater.inflate(R.layout.item_product, parent, false);
        return new ViewHolder(itemOrderView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Product itemOrder = mItemOrders.get(position);
        holder.mItemName.setText(itemOrder.getName());
        holder.mImageView.setImageResource(mContext.getResources().getIdentifier("@drawable/" + itemOrder.getImagePath(),
                "drawable", "upwork.andri.productlisting"));
//        holder.mItemPrice.setText("$ ".concat(String.valueOf(itemOrder.getPrice())));
    }

    @Override
    public int getItemCount() {
        return mItemOrders.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_name)
        TextView mItemName;
        @BindView(R.id.image_view)
        ImageView mImageView;
//        @BindView(R.id.item_price)
//        TextView mItemPrice;
//        @BindView(R.id.item_qty)
//        TextView mItemQty;
//        @OnClick(R.id.dec_qty) void incItem(){
//            mItemOrders.get(getAdapterPosition()).decQty();
//            mItemQty.setText(String.valueOf(mItemOrders.get(getAdapterPosition()).getQty()));
//        }
//        @OnClick(R.id.inc_qty) void decItem(){
//            mItemOrders.get(getAdapterPosition()).incQty();
//            mItemQty.setText(String.valueOf(mItemOrders.get(getAdapterPosition()).getQty()));
//        }

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
