package id.sch.smktelkom_mlg.project.xiirpl406162636.pencariankoskelompok6.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl406162636.pencariankoskelompok6.R;
import id.sch.smktelkom_mlg.project.xiirpl406162636.pencariankoskelompok6.model.Kos;

/**
 * Created by anis ayu on 11/5/2016.
 */

public class KosAdapter extends RecyclerView.Adapter<KosAdapter.ViewHolder> {
    ArrayList<Kos> kosList;
    IKosAdapter mIKosAdapter;

    public KosAdapter(Context context, ArrayList<Kos> kosList) {
        this.kosList = kosList;
        mIKosAdapter = (IKosAdapter) context;
    }

    public KosAdapter(ArrayList<Kos> kosList) {
        this.kosList = kosList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Kos kos = kosList.get(position);
        holder.tvJudul.setText(kos.judul);
        holder.tvDeskripsi.setText(kos.deskripsi);
        holder.ivFoto.setImageURI(Uri.parse(kos.foto));
    }

    @Override
    public int getItemCount() {
        if (kosList != null)
            return kosList.size();
        return 0;
    }

    public interface IKosAdapter {
        void doClick(int pos);

        void doFav(int pos);

        void doShare(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;
        ImageButton ibFav;
        ImageButton ibShare;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
            ibFav = (ImageButton) itemView.findViewById(R.id.buttonFavorite);
            ibShare = (ImageButton) itemView.findViewById(R.id.buttonShare);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIKosAdapter.doClick(getAdapterPosition());
                }
            });
            ibFav.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mIKosAdapter.doFav(getAdapterPosition());
                }
            });
            ibShare.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mIKosAdapter.doShare(getAdapterPosition());
                }
            });
        }
    }
}