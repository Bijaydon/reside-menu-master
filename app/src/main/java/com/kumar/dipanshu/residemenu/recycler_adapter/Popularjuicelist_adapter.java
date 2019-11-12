package com.kumar.dipanshu.residemenu.recycler_adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.kumar.dipanshu.residemenu.Model_classpopular;
import com.kumar.dipanshu.residemenu.R;

import java.util.List;

/**
 * Created by Bijay on 11/12/2019.
 */

public class Popularjuicelist_adapter extends RecyclerView.Adapter<Popularjuicelist_adapter.MyViewHolder> {

    Context context;
    List<Model_classpopular>modal_classpopulars;

    public Popularjuicelist_adapter(Context context, List<Model_classpopular> modal_classpopulars) {
        this.context = context;
        this.modal_classpopulars = modal_classpopulars;
    }


    @Override
    public Popularjuicelist_adapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.popularjuicelist_recycleview, viewGroup, false);
        return new Popularjuicelist_adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Popularjuicelist_adapter.MyViewHolder myViewholder, int position) {


        final  Model_classpopular model_classpopular = modal_classpopulars.get(position);
        myViewholder.fruitnamee.setText(model_classpopular.getFruitnamee());
        myViewholder.fruitcostt.setText(model_classpopular.getFruitcostt());
        myViewholder.fruitamount.setText(model_classpopular.getFruitamount());
        myViewholder.fruitimagee.setImageResource(model_classpopular.getImage());
        myViewholder.fruitdescriptionn.setText(model_classpopular.getFruitdescriptionn());


    }

    @Override
    public int getItemCount() {
        return modal_classpopulars.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView fruitnamee, fruitcostt, fruitamount, fruitdescriptionn;
        ImageView fruitimagee;
        Button addcart_buttonn;

        public MyViewHolder(View itemView) {
            super(itemView);

            fruitnamee = itemView.findViewById(R.id.fruitnamee);
            fruitcostt = itemView.findViewById(R.id.fruitcostt);
            fruitamount = itemView.findViewById(R.id.fruitamount);
            fruitdescriptionn = itemView.findViewById(R.id.fruitdescriptionn);
            fruitimagee = itemView.findViewById(R.id.fruitimagee);
            addcart_buttonn = itemView.findViewById(R.id.addcart_buttonn);
        }
    }
}
