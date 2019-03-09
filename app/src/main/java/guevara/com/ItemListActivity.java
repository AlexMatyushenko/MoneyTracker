package guevara.com;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ItemListActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;
    private List<Record> mData = new ArrayList<>();
    private ItemListAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list);
        mRecycleView = findViewById(R.id.list);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mRecycleView.setAdapter(new ItemListAdapter());
        createData();
        mRecycleView.setAdapter(mAdapter);
    }

    private void createData() {
        mData.add(new Record("Молоко",100));
        mData.add(new Record("Чай",1002));
        mData.add(new Record("Вода",1234));
        mData.add(new Record("Печенье",124235));
        mData.add(new Record("Мясо",43654));
        mData.add(new Record("Сок",3242));
        mData.add(new Record("Рис",31212));
        mData.add(new Record("Гречка",222222222));
        mData.add(new Record("Хлеб",214251));
        mData.add(new Record("Очень долгий текст, который нужно отобразить в поле, чтоб оно не сломалось",0));
        mData.add(new Record("Клавиатура",54754643));
        mData.add(new Record("Монитор",32424234));
        mData.add(new Record("Мышь",32));
        mData.add(new Record("Телефон",32542));
        mData.add(new Record("Книга",323));
        mData.add(new Record("Словарь",35));
        mData.add(new Record("Шнур",325));
        mData.add(new Record("Чай",657));
        mData.add(new Record("Сода",324));
        mData.add(new Record("Кошелек",242));
        mData.add(new Record("Наушники",33));
    }

    private class ItemListAdapter extends RecyclerView.Adapter{

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
            return new RecordViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_record,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        }

        @Override
        public int getItemCount() {
            return mData.size();
        }
    }

    private class RecordViewHolder extends RecyclerView.ViewHolder {
        public RecordViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
