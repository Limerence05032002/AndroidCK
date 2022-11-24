package com.example.listviewnc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReportFragment extends Fragment {
    View v;
    private RecyclerView myRecyclerView,thongTin_recyclerview;
    private List<Top> listTop;
    private List<Infor> listInfor;

    public ReportFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.report_fragment, container, false);

        thongTin_recyclerview = v.findViewById(R.id.thongTin_recyclerview);
        InforAdapter inforAdapter = new InforAdapter(getContext(),listInfor);
        thongTin_recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        thongTin_recyclerview.setAdapter(inforAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listInfor = new ArrayList<>();

        listInfor.add(new Infor(R.drawable.infor1,"Đi vào một giấc ngủ nhanh chóng với 7 bước sau đây.","Tip : 5 phút đọc","1. Hạ nhiệt độ phòng \n\n 2. Sử dụng phương pháp thở 4-7-8 \n\n 3. Lên lịch đi ngủ \n\n 4. Hấp thụ ánh sáng cả ban ngày và ban đêm\n" +
                "                    \n\n 5. Tập yoga, thiền \n\n 6. Tránh nhìn vào đồng hồ \n\n 7. Tránh ngủ vặt trong ngày"));
        listInfor.add(new Infor(R.drawable.infor2,"Thời gian ngủ lý tưởng cho từng độ tuổi.","Tip : 3 phút đọc","Như đã nói ở phần trước của bài viết, mỗi độ tuổi sẽ có thời gian ngủ khác nhau. Ở các bé sơ sinh, trẻ cần ngủ 17 tiếng mỗi ngày. Trong khi đó ở người trưởng thành, thời gian ngủ chỉ cần 7 tiếng đến 9 tiếng trong đêm. Cụ thể thời gian ngủ ở từng độ tuổi như sau: \n\n Trẻ dưới 3 tháng tuổi: Thời gian ngủ từ 14 tiếng đến 17 tiếng.\n" +
                "Trẻ từ 4 tháng đến 2 tuổi: Thời gian ngủ từ 11 tiếng đến 16 tiếng.\n" +
                "Trẻ từ 2 tuổi đến 5 tuổi: Thời gian ngủ từ 10 tiếng đến 13 tiếng.\n" +
                "Trẻ từ 6 tuổi đến 13 tuổi: Thời gian ngủ từ 9 tiếng đến 12 tiếng.\n" +
                "Trẻ từ 14 tuổi đến 17 tuổi: Thời gian ngủ từ 8 tiếng đến 10 tiếng.\n" +
                "Người trưởng thành dưới 64 tuổi: Thời gian ngủ từ 7 tiếng đến 9 tiếng.\n" +
                "Người cao tuổi từ 65 tuổi trở lên: Thời gian ngủ từ từ 7 tiếng đến 8 tiếng. "));
        listInfor.add(new Infor(R.drawable.infor3,"Nhiều lợi ích cho sức khỏe từ giấc ngủ.","Tip : 10 phút đọc","1. Giảm bớt căng thẳng \n 2.Ghi nhớ mọi thứ chính xác hơn \n 3. Giảm cảm lạnh \n 3.Đem lại nhiều năng lượng vào hôm sau. \n 4.Hồi phục sức khỏe \n 5.Tăng cường miễn dịch \n 6.Giúp bạn khỏe hơn, da đẹp hơn"));
        listInfor.add(new Infor(R.drawable.infor4,"Nhu cầu nghỉ ngơi và nhịp điệu Circadian.","Tip : 5 phút đọc", "Nghiên cứu cho thấy nhịp sinh học có ảnh hưởng quan trọng đến năng lượng và mức độ thể chất, cũng như hoạt động của các quá trình cơ thể cần thiết. Một nhịp sinh học lành mạnh có liên quan đến tuổi thọ, giảm mức độ căng thẳng và sự trao đổi chất mạnh mẽ .\n" +
                "\n" +
                "Một nghiên cứu gần đây của MIT đã phát hiện ra rằng một loại protein chống lại các bệnh lão hóa cũng đóng một vai trò quan trọng trong việc kiểm soát nhịp sinh học. Các nhà khoa học cũng đã phát hiện ra một loại protein cụ thể hoạt động với đồng hồ sinh học của cơ thể để điều chỉnh các chức năng trao đổi chất quan trọng. \n" +
                "\n" +
                "Nhịp sinh học không đều có liên quan đến các tình trạng sức khỏe mãn tính như rối loạn giấc ngủ, béo phì và trầm cảm. Nghiên cứu cho thấy những người làm ca đêm có nguy cơ béo phì và tiểu đường cao hơn, đồng thời có thể tăng nguy cơ bị tai nạn. Ánh sáng xanh phát ra từ màn hình điện thoại di động, máy tính, máy tính bảng và ti vi hạn chế sản xuất melatonin và là nguyên nhân chính gây ra nhịp điệu bất thường."));
        listInfor.add(new Infor(R.drawable.infor5,"Nhịp điệu Circadian là gì ?","Tip : 9 phút đọc","Nhịp điệu Circadian hay còn gọi là nhịp sinh học sẽ giúp kiểm soát lịch trình ngủ và thức dậy hàng ngày của mỗi người. Nhịp điệu này gắn liền với đồng hồ sinh học 24 giờ và hầu hết các sinh vật có sự sống đều có nhịp riêng biệt này. \n Nhịp sinh học có thể bị ảnh hưởng bởi các yếu tố bên ngoài như ánh sáng và bóng tối cùng như những yếu tố khác. Bộ não nhận được tín hiệu dựa trên môi trường của mỗi cá nhân và kích hoạt một số hormone nhất định, làm thay đổi nhiệt độ cơ thể và điều chỉnh sự trao đổi chất để giữ cho cơ thể tỉnh táo hoặc gây buồn ngủ, để bạn dễ dàng chìm vào giấc ngủ ngon.\n" +
                "\n" +
                "Mặc dù chúng ta không thể nghe thấy tiếng tích tắc, tuy nhiên cơ thể mỗi người lại có một đồng hồ sinh học riêng. Và chúng sẽ ảnh hưởng đến giấc ngủ của mỗi người cũng như những hoạt động khác của cơ thể, chẳng hạn như hormone, nhiệt độ cơ thể và thói quen ăn uống của chúng ta.\n" +
                "\n" +
                "Khi nhịp sinh học nói riêng bị rối loạn, chúng có thể gây ra những vấn đề về sức khỏe và giấc ngủ. Ngoài ra, rối loạn nhịp sinh học còn liên quan đến các chứng rối loạn khác nhau bao gồm bệnh tiểu đường, béo phì và trầm cảm.\n" +
                "\n" +
                "Vậy nên, để có một giấc ngủ ngon và lành mạnh, bạn cần làm quen với nhịp điệu Circadian của cơ thể và điều gì khiến cho chúng bị hoạt động sai lệch."));
        listInfor.add(new Infor(R.drawable.infor6," Giấc ngủ có thay đổi khi về già.","Tip : 5 phút đọc" ,"Ở người cao tuổi: Cũng như người trưởng thành, người già cũng có 2 chu kỳ ngủ. Tuy nhiên, thường thì thời gian ngủ sâu giấc của người già cực kì ít. Người cao tuổi cũng khó đi vào giấc ngủ hơn, dễ bị tỉnh giấc và dậy sớm hơn. Vì thế, người giá thường có xu hướng thay đổi giấc ngủ. Các nhà khoa học đã kiểm tra và nhận thấy những người lớn tuổi thường bị thức dậy khoảng 3 đến 4 lần mỗi đêm. \nNgười cao tuổi (từ trên 65 tuổi) thường gặp tình trạng khó ngủ, mất ngủ, có xu hướng hướng ngủ ít hơn những độ tuổi khác. Thế nhưng, để đảm được sức khỏe, người lớn tuổi cần thay đổi giấc ngủ để có thể ngủ khoảng 7 đến 8 giờ mỗi ngày. "));
        listInfor.add(new Infor(R.drawable.infor7,"Điều gì xảy ra khi đồng hồ sinh học ngừng hoạt động.","Tip : 10 phút đọc","Lần đầu tiên trong lịch sử nhân loại, chúng ta thực sự có quyền kiểm soát toàn bộ lượng ánh sáng vào bất kể thời điểm nào trong ngày. Vì vậy, chúng ta có thể lập trình ánh sáng chiếu trong nhà theo cách mô phỏng thời tiết giữa mùa hè hoặc mùa xuân.\n" +
                "\n" +
                "Tôi hy vọng trong 10 hoặc 15 năm tới, chúng ta sẽ không còn cần công tắc đèn trong nhà nữa. Chúng ta sẽ lập trình sẵn những công tắc ấy.\n" +
                "\n" +
                "Bạn có thể nói với bóng đèn rằng mấy giờ thì bạn muốn thức dậy, và ngôi nhà thông minh sẽ lập trình đúng lượng ánh sáng và thời gian chiếu. Có lẽ, một hệ thống đèn thậm chí có thể cảm nhận được khi nào bạn đang chán nản, để điều chỉnh ánh sáng khiến bạn vui lên. Công nghệ này có thể sẽ sớm ra đời, chỉ có điều nó sẽ đắt hơn mà thôi. Nhưng vẫn sẽ có những người sẵn sàng trả tiền để có được nó."));

    }
}
