package com.anys.lleve_casera_dv.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.anys.lleve_casera_dv.R;
import com.anys.lleve_casera_dv.model.Opciones;

import java.util.ArrayList;

public class AdaptadorOpciones extends RecyclerView.Adapter<AdaptadorOpciones.ViewHolder>
    implements View.OnClickListener{

    private ArrayList<Opciones> opcionesList;
    private LayoutInflater layoutInflater;
    private Context context;

    //Listener

    private View.OnClickListener listener;



    public AdaptadorOpciones(ArrayList<Opciones> itemList, Context context) {
        this.opcionesList = itemList;
        this.layoutInflater = layoutInflater.from(context);
        this.context = context;
    }


    @Override
    public int getItemCount() {
        return opcionesList.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.lista_opciones_vendedor,parent);
        view.setOnClickListener(this);
        //ViewHolder viewHolder= new AdaptadorOpciones.ViewHolder(view);
        return new ViewHolder(view);
    }

    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView imageView;
        TextView txt_op;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.cv_op_vendedor);
            imageView = itemView.findViewById(R.id.img_list_vend);
            txt_op = itemView.findViewById(R.id.txt_list_vend);

        }
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String nomOp = opcionesList.get(position).getTxt_op();
        int img = opcionesList.get(position).getImg_id();


    }



}
