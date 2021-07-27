package com.example.universitykrasnodar.Tests;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.universitykrasnodar.R;

import java.util.ArrayList;

public class Test_iovashi extends Fragment {
    private String[] Vopros = {"Представьте, что Вы на выставке. Что Вас больше привлекает в экспонатах:", "Какие черты характера в человеке Вам больше всего нравятся:", "Служба быта оказывает людям разные услуги. Считаете ли Вы необходимым:",
"Служба быта оказывает людям разные услуги. Считаете ли Вы необходимым:", "Какое награждение Вас больше бы обрадовало.", "Вы смотрите военный или спортивный парад. Что больше привлекает Ваше внимание:", "Представьте, что у Вас много свободного времени. Чем бы Вы охотнее занялись:", "Какую выставку Вы бы с большим удовольствием посмотрели:",
    "Если бы в школе было два кружка, какой бы Вы выбрали:", "Какие журналы Вы бы с большим удовольствием читали:", "Что важнее для человека:", "Для благополучия общества необходимо:", "Какую из двух книг Вы бы с большим удовольствием читали:",
    "В газете две статьи разного содержания. Какая из них вызвала бы у Вас большую заинтересованность:", "Какая из двух работ на свежем воздухе Вас больше бы привлекала:", "Какая, на Ваш взгляд, задача школы важнее:", "Что, на Ваш взгляд, следует больше ценить у участников самодеятельности:", "Какая, на Ваш взгляд, область деятельности человека в дальнейшем будет иметь доминирующее значение:", "Что обществу принесет больше пользы:",
    "Какого характера научную работы Вы бы выбрали:", "Представьте, что Вы - профессор университета. Чему Вы отдали бы предпочтение в свободное от работы время:", "Вам представляется возможность совершить путешествие в разные страны. В качестве кого Вы охотнее поехали бы:", "Какие лекции слушали бы Вы с большим удовольствием:", "Что Вас больше привлекает при чтении книг:", "Вам представляется возможность выбора профессии. Какой из них Вы бы отдали предпочтение:", "Какими выдающимися учеными Вы больше интересуетесь:", "Как Вам кажется, на что следовало бы в школе обратить большее внимание:", "Что бы Вас больше заинтересовало в печати:", "Если бы Вам представилась возможность занять определенный пост, какой бы Вы выбрали:", "Как Вы считаете, что важнее:"};
    private String[] Aa = {"цвет, совершенство форм", "дружелюбие, чуткость, отсутствие корысти", "и впредь развивать эту отрасль, чтобы всесторонне обслуживать людей", "за общественную деятельность", "сложность ходьбы, грациозность участников парада", "чем-либо практическим (ручным трудом)", "новинок научной аппаратуры (в области физики, химии, биологии)", "музыкальный", "на сплоченность коллектива", "литературно-художественные", "создавать себе благополучный, удобный быт", "техника", "о развитии науки в нашей стране", "о машине нового типа", "работа, связанная с постоянными передвижениями (агроном, лесничий, дорожный мастер)", "подготовить учащихся к работе с людьми, чтобы они могли помогать другим создавать материальные блага", "то, что они несут людям искусство и красоту", "физика", "забота о благосостоянии граждан", "работу с книгами в библиотеке", "занятиям по литературе", "как известный спортсмен на международные соревнования", "о выдающихся художниках", "яркое изображение смелости и храбрости героев", "работе малоподвижной, но связанной с созданием новой техники", "Поповым и Циолковским", "на спорт, так как это нужно для укрепления здоровья", "сообщение о состоявшейся художественной выставке", "главного инженера завода", "много знать"};
    private String[] Bb = {"их внутреннее устройство (как и из чего они сделаны)", "мужество, смелость, выносливость", "создавать такую технику, которой можно было бы самим пользоваться в быту", "за научное изобретение", "внешнее оформление колонн (знамена, одежда и пр.)", "общественной работой (на добровольных началах)", "новых продовольственных товаров", " технический", "на создание необходимых удобств", "научно-популярные", "жить без некоторых удобств, но иметь возможность пользоваться сокровищницей искусства, создавать искусство", "правосудие", "о достижениях спортсменов нашей страны", "о новой научной теории", "работа с машинами", "подготовить учащихся к практической деятельности, к умению создавать материальные блага", "то, что они выполняют общественно полезную работу", "физическая культура", "изучение поведения людей", "работу на свежем воздухе в экспедиции", "опытам по физике, химии", "как известный специалист по внешней торговле с целью покупки необходимых товаров для нашей страны", "о выдающихся ученых", "прекрасный литературный стиль", "физической культуре или другой работе, связанной с движением", "Менделеевым и Павловым", "на успеваемость учащихся, так как это необходимо для будущего", "известие о прошедшем митинге в защиту прав человека", "директора универмага", "создавать материальные блага"};
    private String[] isc = {"цвет, совершенство форм", " внешнее оформление колонн (знамена, одежда и пр.)", "музыкальный", "литературно-художественные", "жить без некоторых удобств, но иметь возможность пользоваться сокровищницей искусства, создавать искусство", "то, что они несут людям искусство и красоту", "занятиям по литературе", "о выдающихся художниках", "прекрасный литературный стиль", "сообщение о состоявшейся художественной выставке"};
    private String[] tech = {"их внутреннее устройство (как и из чего они сделаны)", "создавать такую технику, которой можно было бы самим пользоваться в быту", "чем-либо практическим (ручным трудом)", "технический", "техника", "о машине нового типа", "работа с машинами", "работе малоподвижной, но связанной с созданием новой техники", "Поповым и Циолковским", "директора универмага"};
    private String[] rab = {"дружелюбие, чуткость, отсутствие корысти", "за общественную деятельность", "общественной работой (на добровольных началах)", " на сплоченность коллектива", "правосудие", "подготовить учащихся к работе с людьми, чтобы они могли помогать другим создавать материальные блага", "то, что они выполняют общественно полезную работу", "изучение поведения людей", "о выдающихся ученых", "известие о прошедшем митинге в защиту прав человека"};
    private String[] umstv = {"за научное изобретение", "новинок научной аппаратуры (в области физики, химии, биологии)", "научно-популярные", "о развитии науки в нашей стране", "о новой научной теории", "физика", "работу с книгами в библиотеке", "опытам по физике, химии", "Менделеевым и Павловым", "много знать"};
    private String[] fiz = {"мужество, смелость, выносливость", "сложность ходьбы, грациозность участников парада", "о достижениях спортсменов нашей страны", "работа, связанная с постоянными передвижениями (агроном, лесничий, дорожный мастер)", "физическая культура", "работу на свежем воздухе в экспедиции", "как известный спортсмен на международные соревнования", "яркое изображение смелости и храбрости героев", "физической культуре или другой работе, связанной с движением", "на спорт, так как это нужно для укрепления здоровья"};
    private String[] mat = {"и впредь развивать эту отрасль, чтобы всесторонне обслуживать людей", "новых продовольственных товаров", "на создание необходимых удобств", "создавать себе благополучный, удобный быт", "подготовить учащихся к практической деятельности, к умению создавать материальные блага", "забота о благосостоянии граждан", "как известный специалист по внешней торговле с целью покупки необходимых товаров для нашей страны", "на успеваемость учащихся, так как это необходимо для будущего", "главного инженера завода", "создавать материальные блага"};
    private String[] otvet = new String[Vopros.length];
    private ArrayList<RadioGroup> Radiobutton_button = new ArrayList();
    private LinearLayout llgoland_test = null;
    private int k;
    public int isc_con;
    public int tech_con;
    public int rab_con;
    public int umstv_con;
    public int fiz_con;
    public int otvet_con;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test_iovashi, container, false);

        initViews(view);
        for (int i = 0; i < Vopros.length; i++) {
            LinearLayout llgolland = createFacultyLinearLayout();
            RadioGroup radioGroup = createGollandRadioGroup();
            RadioButton radioButton = otvet_a(i);
            RadioButton radioButton2 = otvet_b(i);
            TextView text_golland = text(i);
            radioGroup.addView(radioButton);
            radioGroup.addView(radioButton2);
            Radiobutton_button.add(radioGroup);
            llgolland.addView(text_golland);
            llgolland.addView(radioGroup);
            setClickListenerForRadio_Group(i, radioButton, radioButton2);
            llgoland_test.addView(llgolland);
        }
        zaver(view);
        return view;
    }





    private void initViews(View view) {
        llgoland_test = view.findViewById(R.id.lliovashi);
    }

    private LinearLayout createFacultyLinearLayout() {
        Context context = getContext();
        int id = View.generateViewId();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(7, 10, 7, 10);
        if (context == null) return null;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundResource(R.drawable.style_main_shape);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(id);

        return linearLayout;
    }

    private TextView text(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        TextView textView = new TextView(context);
        textView.setId(id);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(50, 50, 50, 50);
        textView.setText(Vopros[i]);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        textView.setTextColor(Color.parseColor(color));
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 19);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private RadioGroup createGollandRadioGroup() {
        Context context = getContext();
        int id = View.generateViewId();
        RadioGroup radioButton = new RadioGroup(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        radioButton.setId(id);
        return radioButton;
    }

    private RadioButton otvet_a(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 50, 50, 50);
        radioButton.setText(Aa[i]);
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }

    private RadioButton otvet_b(int i) {
        Context context = getContext();
        int id = View.generateViewId();
        RadioButton radioButton = new RadioButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(25, 0, 0, 0);
        radioButton.setId(id);
        radioButton.setPadding(15, 50, 50, 50);
        radioButton.setText(Bb[i]);
        radioButton.setLayoutParams(layoutParams);
        radioButton.setButtonTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R.color.green_color)));
        radioButton.setHighlightColor(getResources().getColor(R.color.green_color));
        radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        String color = getString(Integer.parseInt(String.valueOf(R.color.black)));
        radioButton.setTextColor(Color.parseColor(color));
        return radioButton;
    }

    private void setClickListenerForRadio_Group(int indexOfButton, RadioButton button_a, RadioButton button_b) {
        RadioGroup radioGroups = Radiobutton_button.get(indexOfButton);
        radioGroups.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (button_a.isChecked() == true) {
                    otvet[indexOfButton] = Aa[indexOfButton];
                }
                if (button_b.isChecked() == true) {
                    otvet[indexOfButton] = Bb[indexOfButton];
                }
            }
        });
    }
    public void otvet_test(){
        k = 0;
        for(int i = 0; i <isc.length; i++ ){
            for (int j = 0; j < otvet.length; j++) {
                if (isc[i] == otvet[j]) {
                    isc_con++;
                }
            }
        }
        for(int i = 0; i <tech.length; i++ ){
            for (int j = 0; j < otvet.length; j++) {
                if (tech[i] == otvet[j]) {
                    tech_con++;
                }
            }
        }
        for(int i = 0; i <rab.length; i++ ){
            for (int j = 0; j < otvet.length; j++) {
                if (rab[i] == otvet[j]) {
                    rab_con++;
                }
            }
        }
        for(int i = 0; i <umstv.length; i++ ){
            for (int j = 0; j < otvet.length; j++) {
                if (umstv[i] == otvet[j]) {
                    umstv_con++;
                }
            }
        }
        for(int i = 0; i <fiz.length; i++ ){
            for (int j = 0; j < otvet.length; j++) {
                if (fiz[i] == otvet[j]) {
                    fiz_con++;
                }
            }
        }
        for(int i = 0; i <fiz.length; i++ ){
            for (int j = 0; j < otvet.length; j++) {
                if (fiz[i] == otvet[j]) {
                    fiz_con++;
                }
            }
        }
        for(int i = 0; i <mat.length; i++ ){
            for (int j = 0; j < otvet.length; j++) {
                if (mat[i] == otvet[j]) {
                    otvet_con++;
                }
            }
        }
        for (int i = 0; i < otvet.length; i++){
            if(otvet[i] == null){
                k++;
            }
        }
    }

    public void zaver(View view) {
        Button but_zav = view.findViewById(R.id.konez_iovashi);

        but_zav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvet_test();
                if(k == 0) {
                    Bundle bundle=new Bundle();
                    bundle.putInt("result_of_test", isc_con);
                    bundle.putInt("intel_of_test", tech_con);
                    bundle.putInt("soc_of_test", rab_con);
                    bundle.putInt("kon_of_test", umstv_con);
                    bundle.putInt("pred_of_test", fiz_con);
                    bundle.putInt("artist_of_test", otvet_con);
                    Navigation.findNavController(v).navigate(R.id.action_test_iovashi_to_resultat_iowashi,bundle);
                }
                else{
                    Toast toast = Toast.makeText(getContext(),
                            "Вы ответили не на все вопросы", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


    }
}
