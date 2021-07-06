package com.example.zodiacsign;


import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

   int month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        TextView sign_TextView=findViewById(R.id.sign_TextView);
        TextView sigh_view=findViewById(R.id.sigh_view);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            month = extras.getInt("month_name");
        }



        if(month==1){

            sigh_view.setText(Html.fromHtml("&#x2648"));
            sign_TextView.setText("Taurus is very old-fashioned when it comes to love – he wants someone who will keep the relationships as romantic as an old, black and white movie. So, when deciding what to text him, try to keep it simple, yet cute.");

        }else if (month==2){
            sigh_view.setText(Html.fromHtml("&#x264a"));
            sign_TextView.setText("Aries loves a challenge, so giving him the challenge of trying to guess what you've got planned for the two of you that night is the perfect way to keep him on his toes and thinking about you all day. You can let him guess all day or reveal what your plans are eventually – it's up to you!");

        }else if (month==3){
            sigh_view.setText(Html.fromHtml("&#x264c"));
            sign_TextView.setText("Simple and straight to the point (and a little flirty) – everything a Gemini could ask for in a morning text. It's short enough for him to read while he's getting ready to start his day, but flirty and provoking enough to keep you on his mind until your date later.");

        }else if (month==4){
            sigh_view.setText(Html.fromHtml("&#x264e"));
            sign_TextView.setText("Cancer really just wants to spend time with you. You could substitute any part of this text message with something you think he'll respond to best and it'll still work its charm on him. That said, there's something very intimate about cooking together that he'll love.");

        }else if (month==5){
            sigh_view.setText(Html.fromHtml("&#x2650"));
            sign_TextView.setText("Leo loves compliments, but a compliment from one of his favorite people (you!)? Well, that just takes the cake. This is the perfect morning text for him because he'll be thinking of your kind words all day. He's already crazy about you, but a text like this will make him even crazier.");

        }else if (month==6){
            sigh_view.setText(Html.fromHtml("&#x2652"));
            sign_TextView.setText("Virgo spends so much of his time taking care of the people he loves that sending him a morning text asking how you can help will remind him why he fell for you in the first place. He's the kind of person who will go out of his way to help someone in need, but it's rare the favor is returned.");

        }else if (month==7){
            sigh_view.setText(Html.fromHtml("&#x2649"));
            sign_TextView.setText("Libra is a HUGE fan of romance, which is why the perfect kind of relationship for him is one where his partner is constantly falling head over heels for him. He's not vain, but he loves a heartfelt compliment to make him blush every now and then.");

        }else if (month==8){
            sigh_view.setText(Html.fromHtml("&#x264b"));
            sign_TextView.setText("Scorpio should never be pigeon-holed as the zodiac sign that only wants physical closeness because he's much more than that. If you want to keep him around, you have to prove that you want him for him mind and soul, not just his body.");

        }else if (month==9){
            sigh_view.setText(Html.fromHtml("&#x264d"));
            sign_TextView.setText("Sagittarius is someone who loves to flirt and date but doesn't want to feel tied down or suffocated. If you send a text like this, you're basically giving him an invitation to hang out without making him feel obligated to give you an answer right away – the perfect middle ground.");

        }else if (month==10){
            sigh_view.setText(Html.fromHtml("&#x264f"));
            sign_TextView.setText("If you're lucky enough to be able to text a Capricorn first thing in the morning, it probably means that he's really into you – he doesn't let just anyone into his life. But you should also know that he's always on his grind and needs someone who can respect that he gets busy often.");

        }else if (month==11){
            sigh_view.setText(Html.fromHtml("&#x2651"));
            sign_TextView.setText("This might seem a little dry, but Aquarius is much more likely to respond to a text that is simple and straightforward than to one that makes you seem too clingy or needy. He needs to know that you're okay with him taking it slow and giving him space when he needs it.");

        }else if(month==12){
            sigh_view.setText(Html.fromHtml("&#x2653"));
            sign_TextView.setText("This is a text message that is certain to get a response out of Pisces without making it seem like you were having dirty thoughts about him all night. He's definitely a flirty and romantic zodiac sign, but he's also hot and cold – which means you can never tell how he'll respond at first.");

        }else {
            sigh_view.setText("no zotiac sigh");
        }







    }
}
