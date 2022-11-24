package com.example.listviewnc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    Button play;
    ImageView user;

    View v;
    private RecyclerView myRecyclerView,Love_recyclerview,Story_recyclerview;
    private List<Top> listTop;
    private List<Love> listLove;
    private List<Story> listStory;



    public HomeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.home_fragment, container, false);

        myRecyclerView = v.findViewById(R.id.Top_recyclerview);
        TipViewAdapter tipViewAdapter = new TipViewAdapter(getContext(),listTop);
        myRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        myRecyclerView.setAdapter(tipViewAdapter);

        Love_recyclerview = v.findViewById(R.id.Love_recyclerview);
        LoveViewAdapter loveViewAdapter = new LoveViewAdapter(getContext(),listLove);
        Love_recyclerview.setLayoutManager(new GridLayoutManager(getActivity(),3));
        Love_recyclerview.setAdapter(loveViewAdapter);

        Story_recyclerview = v.findViewById(R.id.Story_recyclerview);
        StoryViewAdapter storyViewAdapter = new StoryViewAdapter(getContext(),listStory);
        Story_recyclerview.setLayoutManager(new GridLayoutManager(getActivity(),3));
        Story_recyclerview.setAdapter(storyViewAdapter);

        user = v.findViewById(R.id.user);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });

        return v;
    }

    private void openProfile() {
        Intent intent = new Intent(getActivity(),Profile.class);
        startActivity(intent);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listTop = new ArrayList<>();

        listTop.add(new Top(R.drawable.tieuthuyet1,"CHÚNG TA CỦA HIỆN TẠI","Võ Trần Trung Anh","Gia tộc họ Trần là một trong những gia tộc nổi tiếng tại khu Bạch Đằng, hiện nay là bến Bạch Đằng gần với phố đi bộ Nguyễn Huệ, Q1. Gia tộc được đứng đầu gồm Trần Thế và ông Trần Bắc, Lúc này bố Trần Thế là Trần Sơn vừa mất nên nhường lại ngai vàng cho anh nắm giữ nhưng có quá nhiều trở ngại xoay quanh con đường kinh tế của gia tộc. Trần Thế lúc đó là một người sống có nghĩa tình, tuy gia tộc có nhiều bất cập song vẫn ung dung vì bản lĩnh cho phép Trần Thế có thể đảm bảo mọi thứ được ổn định. Tuy nhiên, khi Trần Thế bắt đầu một hành trình mới cũng là lúc Thanh Thanh bước vào cuộc đời anh, như một ngòi bút, Thanh Thanh vẽ nên bức Tranh của cuộc sống Trần Thế nhiều màu sắc tươi sáng. \n" +
                "\n" +
                "Họ cùng nhau trải qua những ngày tháng hạnh phúc nhất trong cuộc đời mình, song Trần Thế vẫn không dám ngỏ lời yêu cô gái ấy vì Trần Thế hiểu rằng xung quanh mình có rất nhiều mối nguy hiểm đang rình rập, họ không thể tấn công vào trực tiếp anh nhưng có thể dùng những người thân bên cạnh để uy hiếp anh. Chuyện của Trần Thế lúc này đến tai của bà Phượng Xuân, chủ gia tộc họ Phan, là 1 trong những đối thủ lớn của gia tộc họ Trần. Bà bắt giữ Thanh Thanh và uy hiếp Trần Thế để đánh đổi, vì bà hiểu rằng ngày nào Trần Thế còn tồn tại ngày đó gia tộc họ Phan không thể ngồi yên trên thương trường. Để rồi khi Trần Thế rời đi, ngỏ vào tai của người thân cận lúc lên xe giao lại việc của gia tộc cho Trần Bắc, và một đội đi giải cứu Thanh Thanh. \n" +
                "\n" +
                "Trần Thế đã dấn mình vào hang cọp để đổi lấy tính mạng cho Thanh Thanh, và câu hát 'điều anh luôn giữ mãi trong tim' chính là bước đậm cho những hoài bảo và ước mơ của Trần Thế cho tình yêu, cho tương lai cùng người mình yêu, tuy nhiên điều đó chỉ có thể giữ lại trong tim mà thôi. \n" +
                "\n" +
                "Giọt nước mắt cuối cùng cũng là hình ảnh đầu phim, mà người ta hay gọi là 'giọt nước mắt bay ngược lên bầu trời' chính là 1 nét chấm phá cho bức tranh cuộc đời của Trần Thế với những hoài bão, ước mơ và những niệm tình xa xăm với người con gái mà mình yêu quý nhất."));
        listTop.add(new Top(R.drawable.tieuthuyet2,"TỪNG ĐÓA BỌT SÓNG","Hoa Du","Cửa vừa mở, người đàn bà ướt nhẹp đổ ập về phía tôi. Trong làn nước mưa và gió lạnh, hơi thở của cô phả vào mặt tôi nồng nặc mùi men. Tôi bế thốc cô chủ lên, chạy vào nhà. Đôi môi xinh xắn tím tái, nhợt nhạt, bàn tay yếu ớt vẫn giữ chặt lấy tay tôi không chịu rời. \"Có lẽ chị bị cảm rồi, để tôi..\". \"Không cần đâu, tôi không sao\".\n" +
                "\n" +
                "Tôi ngồi xuống bên cạnh cô, tự nhiên thấy lòng mình êm đềm đến thế. Ánh mắt cô khép lại, hơi thở đều đều như đã ngủ, tôi đứng dậy định ra dắt chiếc xe và đóng cửa thì bàn tay cô đã nắm lấy tay tôi níu lại, cô ngồi bật dậy ôm cứng lấy tôi. Ngực cô trạm vào tôi nóng hổi, mái tóc dài xõa đến thắt lưng cứ xoắn xuýt lấy tôi, như níu lấy đôi tay… Không biết mưa còn rơi bao lâu, tôi đã ôm cô trong đêm giá lạnh bao lâu nữa. Cho đến khi nghe tiếng cô thì thầm hỏi: \"Cậu đã bao giờ ôm một cô gái trong lúc trời mưa chưa?\". \"Chị đã ôm bao nhiêu người đàn ông khi trời mưa đến\". Tôi hỏi lại. Tiếng cười của cô bật lên phảng phất ngay mang tai, nhẹ nhàng nhưng đau nhói, tôi biết thế.\n" +
                "\n" +
                "Tôi với chiếc chăn len dưới sàn quàng qua vai cô, quấn chặt và đặt cô nằm xuống ghế. \"Chị hãy ngủ đi\". Và lần này thì cô ngoan ngoãn nghe lời tôi, cô ngủ thật. Tôi cất xe, lên gác ngó cậu học trò đã ngủ yên trên giường của nó rồi mới yên tâm rời đi. Trước khi bước ra khỏi ngôi nhà tôi đã đặt lên môi cô một nụ hôn không đủ để làm cô thức giấc. Và tôi không trở lại ngôi nhà đó nữa."));
        listTop.add(new Top(R.drawable.tieuthuyet3,"NẾU GIÂY PHÚT ẤY TA KHÔNG GẶP NHAU","Phỉ Ngã Tư Tồn","Nước mưa táp vào ô cửa sổ pha lê, phát ra vài âm thanh nhỏ rung động. Để lại vệt nước hình bầu dục. Chưa đợi vệt nước này tan hết, lại có một vệt nước khác hình bầu dục chồng lên. Dường như càng lúc càng nhiều, càng lúc càng dày, từ trên cửa kính pha lê không ngừng trượt xuống.\n" +
                "\n" +
                "Bàn trang điểm của mẹ ngay cạnh cửa sổ. Tôi nghe nói mẹ rất thích mưa. Dung mạo của mẹ tôi không nhớ rõ, cũng chưa nhìn thấy ảnh chụp. Nhưng có rất nhiều trưởng bối đều nói rằng tôi lớn lên giống mẹ, vì chuyện đó nên tôi thường soi gương. Nói ra thì tôi cũng thuộc dạng xinh đẹp, nhưng mà, cũng chỉ dừng lại ở xinh đẹp, mà vẻ xinh đẹp này cũng là vì tôi có một người mẹ xinh đẹp. Mọi người đều nói mẹ không chỉ xinh đẹp mà còn mỹ lệ, quyến rũ. Bác Lôi khi nhắc tới mẹ của tôi đều nói: \"Nhất cố khuynh nhân thành, tái cố khuynh nhân quốc. Có hiểu không?\"\n" +
                "\n" +
                "Tôi không nghĩ bác Lôi khoa trương quá, bởi vì tùy tiện hỏi mấy người chơi thân với gia đình tôi đều nói rằng: \"Phu nhân của Tam công tử? Mỹ nhân, đích thực là mỹ nhân...\"\n" +
                "\n" +
                "Quên nói rõ, Tam công tử chính là cách người khác gọi cha tôi hồi trẻ. Cha tôi nổi tiếng là \"Kỵ mã ỷ tà kiều, mãn lâu hồng tụ chiêu\".\n" +
                "\n" +
                "(*Trích trong 'Bồ Tát Man' kỳ 4, nghĩa là: Cưỡi lên ngựa, tựa vào chiếc cầu nghiêng nghiêng, khắp các lầu những cánh tay áo hồng vẫy gọi.)\n" +
                "\n" +
                "Cha đi tới đâu là người ta kinh sợ tới đó. Tôi cũng đã nghe qua rất nhiều câu chuyện, chỉ có điều chưa từng nghe ai nói quá nhiều về chuyện của cha và mẹ, ngay cả bản thân cha cũng không đề cập tới. Tôi không nghĩ là cha lại có thể lạnh nhạt, phản bội một mỹ nhân như mẹ được đâu. Người như cha tại sao lại không có một câu chuyện oanh liệt nào? Tôi không tin! Các bác đều nói tôi giống mẹ, nhưng tính cách thì lại giống cha. Tôi thừa nhận, tính tình của tôi táo bạo mạnh mẽ lại dễ tức giận, cực kỳ giống cái tính nôn nóng của cha. Mỗi lần nhắc đến mẹ, nếu cha không nổi trận lôi đình thì là xoay người bỏ đi, điều này càng khiến tôi chắc chắn rằng trong câu chuyện này có ẩn tình, hy vọng một ngày có thể giải được câu đố đó, tôi sẽ tìm kiếm, nhất định sẽ tìm hiểu. Tôi không tin lại không có câu trả lời minh bạch.\n" +
                "\n" +
                "Hoàng hôn có dấu hiệu sắp mưa triền miên, tôi ở trong thư phòng tìm sách. Ngồi trên bậc thang lật giở từng trang quyển sách cổ đóng chỉ. Vô tình mở một quyển, có một tờ giấy mỏng rơi xuống, giống như hồ điệp nhẹ nhàng bay lượn, đáp xuống mặt đất. Lúc đầu tôi còn tướng là thẻ kẹp sách, đến khi nhặt lên mới phát hiện ra là một tờ giấy cũ, mặt trên chỉ có vỏn vẹn mấy lời:\n" +
                "\n" +
                "\"Mục Lan. Thứ lỗi cho tôi không thể tới gặp cậu. Lần trước, sau khi chúng ta gặp nhau một lần, anh ấy lại nổi trận lôi đình, tình cảnh đó cực kỳ đáng sợ. Anh ấy không tin tôi, anh ấy nói sau này cũng sẽ không tiếp tục tin tôi, tôi thực sự rất tuyệt vọng. Nét chữ nắn nót, yếu đuối, tôi từ trước đến giờ chưa từng thấy qua. Tôi đứng ngẩn người tại chỗ, một lúc lâu sau mới lật quyển sách kia ra xem, đó là một quyển « Tống Từ » kẹp một mảnh giấy sơ sài vô danh chỉ viết mấy dòng « Cửu Trương Cơ » \"Trang thứ tám, hồi văn biết là ai viết? Dệt thành một dải thê lương, đọc một lần, im lặng không nói lên lời, không đành lòng lại thêm suy nghĩ.\" Bên cạnh lời kết của bài từ là một hàng chữ nhỏ yếu ớt: \"Không kìm được lại suy nghĩ. Khi dung mạo tiểu thư phai tàn, quay đầu nhìn lại có được những gì?\" Tôi chần chừ, chữ viết này không phải của bà nội, lại càng không phải của hai bà cô, vậy thì là của ai viết? Ai có thể ở trong thư phòng này viết thư? Chẳng lẽ là mẹ?\n" +
                "\n" +
                "Tôi giống cha ở điểm đã nói là làm, ngay lập tức muốn điều tra bắt đầu từ người tên Mục Lan này. Tôi gọi điện cho bác Lôi, bác vừa nghe thấy giọng tôi liền cười: \"Đại tiểu thư, lần này là chuyện gì đây? Không phải lại giống như lần trước, lại giúp cháu đi tìm người bạn học bị mất liên lạc chứ?\""));

        listLove = new ArrayList<>();

        listLove.add(new Love(R.drawable.truyenngan1,"VỢ NHẶT","Kim Lân","Truyện ngắn Vợ nhặt của nhà văn Kim Lân trích trong tập Con chó xấu xí. Chuyện kể về số phận của một chàng trai với cái tên là Tràng. Trong thời buổi nạn đói hoành hành của những năm 1945 đã làm hơn 2 triệu người chết, đâu đâu cũng là sự chết chóc mà chàng trai tên là Tràng lại cưới vợ (hay nói đúng hơn là nhặt được vợ). Tràng được tác giả miêu tả là một anh chàng rất xấu trai, ăn nói cộc lốc, thô kệch, ấy thế mà lại lấy được vợ. Khi nghe tin anh Tràng cưới vợ thì cả xóm nơi Tràng ở đều ngạc nhiên và lo lắng cho anh, đặc biệt là mẹ của anh mà mọi người gọi bà là bà cụ Tứ lúc vui lúc buồn không biết tại sao? Khi con trai của bà cưới vợ mà bà chẳng có gì hơn ngoài lời chúc đến vợ chồng anh là hãy sống tốt. Bữa cơm ăn mừng cho sự xuất hiện của nàng dâu mới, bà cụ kể toàn những chuyện vui, bà hi vọng rằng tương lai của hai đứa con mình sẽ tươi sáng, “nồi chè khoán” do chính tay bà nấu tuy chát đắng nhưng thể hiện được sự quan tâm của bà tới hạnh phúc của con. Đang trong cuộc vui của gia đình mừng nàng dâu mới thì có tiếng trống thúc thuế dồn dập, trong đầu Tràng nghĩ tới lá cờ Việt Nam bay phất phới cùng nhiều người đi cướp kho thóc của giặc để chia cho dân nghèo. Đó là tinh thần đoàn kết của người dân cùng khổ trong chiến tranh và họ vẫn luôn hi vọng rằng sẽ có một tương lai tươi sáng hơn đang chờ đón họ phía trước."));
        listLove.add(new Love(R.drawable.truyenngan2,"CHÍ PHÈO","Nam Cao","Chí Phèo là một đứa trẻ bị bỏ hoang trong cái lò gạch cũ, được người dân làng Vũ Đại truyền tay nhau nuôi, từ anh thả ống lươn cho đến bà góa mù và bác phó cối. Đến khi hắn 18 tuổi thì Chí bắt đầu đi làm thuê cho nhà Bá Kiến. Vợ của Bá Kiến bắt Chí Phèo phải đấm lưng, xoa đầu cho bà ta và Chí đã bị Bá Kiến sai bọn tay sai giải ra huyện, rồi Chí bị đi tù bảy, tám năm. Ngay khi được thả ra khỏi tù, Chí đã cầm vỏ chai đến nhà Bá Kiến để vạch mặt và ăn vạ. Nhưng lão Bá Kiến rất khôn, hắn cho Chí năm đồng bạc để uống rượu. Chí được xoa dịu bằng năm đồng bạc ấy đã nguôi ngoai, Chí rơi vào hoàn cảnh lúc nào cũng say xỉn, chỉ cần ai cho tiền là có thể làm bất cứ điều gì. Bá Kiến nhờ vậy mà khiến cho Chí trở thành tay sai của hắn ta. Chí Phèo trở thành một con quỷ dữ của làng Vũ Đại. Chí Phèo say xỉn, phá làng, phá xóm, đi đâm thuê chém mướn cho nhà Bá Kiến. Cho đến một hôm, cũng trong những cơn say như thường ngày, Chí đi về lều thì thấy Thị Nở đang nằm ngủ há hốc mồm dưới ánh trăng. Thế là Chí ôm chầm lấy Thị Nở và ân ái với nhau. Sáng hôm sau khi Chí tỉnh rượu, Chí được Thị nấu cho một bát cháo hành. Cả cuộc đời Chí chưa từng được ai chăm lo cho như vậy, Chí thấy mình muốn làm người lương thiện. Bát cháo hành của Thị Nở đã làm thức tỉnh lại phần người trong Chí nhưng cánh cửa làm người lương thiện lại đóng sập lại khi Chí Phèo bị bà cô của Thị Nở nhất quyết phản đối. Bà cô nói rằng: \"Ai lại đi lấy thằng Chí Phèo\", \"thằng chỉ có một nghề rạch mặt ăn vạ!\" Chí Phèo nghe vậy khóc rưng rức, đành lủi thủi đi về. Cuối cùng, Chí đến nhà Bá Kiến và chỉ vào mặt hắn nói: \"Ai cho tao lương thiện? Tao muốn làm người lương thiện.\" Chí giết chết Bá Kiến rồi tự sát, Thị nở chỉ còn biết nhìn vào bụng và nghĩ về cái lò gạch cũ."));
        listLove.add(new Love(R.drawable.truyenngan3,"ĐÔI MẮT","Nam Cao","Truyện ngắn “Đôi Mắt” của nhà văn Nam Cao xoay quanh hai cái nhìn, hai cách sống khác nhau của Hoàng và Độ đối với cuộc kháng chiến chống Pháp. Truyện ngắn như là một bản tuyên ngôn nghệ thuật của các nhà văn trí thức trong xã hội sau cuộc cách mạng tháng tám năm 1945. Các văn nghệ sĩ cần phải luôn đổi mới nhận thức, phải có cái nhìn toàn diện, hoà nhập với xã hội nếu không họ sẽ trở thành những con người giống nhân vật Hoàng, mãi thu mình trong vỏ bọc, trở nên lố bịch với tất cả mọi người.\n" +
                "\n" +
                "Câu chuyện về “ Đôi mắt” được bắt đầu bằng cuộc viếng thăm của Độ với người bạn cũ, một nhà văn, hai người chơi với nhau từ những năm 1945.\n" +
                "\n" +
                "Khi cuộc chiến tranh chống thực dân Pháp xâm lược diễn ra, Độ đã đi theo tiếng gọi của cách mạng nông dân, trở thành một chiến sĩ tuyên truyền kháng chiến chống Pháp. Còn Hoàng nghe theo lời của “Cụ Hồ” vội dẫn vợ con di tản khỏi về vùng nông thôn nằm cách Hà Nội vài trăm mét.\n" +
                "\n" +
                "Độ đến thăm vợ chồng Hoàng với ý định muốn vận động Hoàng tham gia văn hóa cứu quốc với mình. Nhà Hoàng vẫn sống trong ngôi nhà ba gian gạch sạch sẽ, vẫn nuôi một chú chó Becgie, và lần này vợ chồng Hoàng đón tiếp Độ rất cởi mở, chu đáo khác hẳn những lần trước đó ở Hà Nội. Họ ngồi nói chuyện kể về cuộc sống của nhau, lúc đó Độ nhận ra tuy vợ chồng Hoàng rất ca tụng chủ tịch Hồ Chí Minh nhưng không lại không tin vào sự lãnh đạo của tầng lớp nông dân. Hoàng ca thán rằng những người nhà quê xung quanh đây đều là những người rất đần độn, ngu dốt, sống lỗ mãng, ích kỹ, rất tham lam, luôn tọc mạch vào chuyện người khác, viết chữ quốc ngữ thì sai vẫn nhưng lại luôn bàn luận về chính trị. Rồi Hoàng kể chuyện về một ông chủ tịch khu phố nhưng xuất thân từ bán cháo lòng, một anh thanh niên đi vác bó tre làm công tác phá hoại cản cơ giới của địch…."));
        listStory = new ArrayList<>();

        listStory.add(new Story(R.drawable.truyennuocngoai,"HUCKLEBERY FINN","Mark Twain","Câu chuyện bắt đầu tại quê hương của Huck ở St.Petersburg, Missouri, nơi bà góa phụ Douglas nghiêm khắc đang nuôi dạy Huck. Người cha nghiện rượu của Huck, Pap, quay trở lại thị trấn, và quấy rối Huck vì anh ta, kết quả của những cuộc phiêu lưu trong cuốn sách trước, \"Những cuộc phiêu lưu của Tom Sawyer,\" đã trở nên khá giàu có. Pap bắt cóc Huck và nhốt anh ta trong một căn nhà gỗ cho đến khi Huck trốn thoát và tự làm giả cái chết của mình trước khi đi xuống tàu. Trên đường đi, anh ghé qua đảo Jackson, nơi anh gặp Jim, nô lệ của cô Watson, người đã trốn thoát sau khi nghe nói về kế hoạch bán anh cho một đồn điền. Họ ở lại hòn đảo một thời gian, nhưng nhanh chóng quyết định rời đi sau khi phát hiện ra rằng mọi người nhận thấy có khói bốc ra từ hòn đảo và định tìm kiếm nó.\n" +
                "\n" +
                "Huck và Jim, những người dự định bắt một chiếc thuyền hơi nước về phía bắc sau khi đi bè xuống cửa sông Ohio, chạm trán với những tên cướp, quý tộc thù địch và những kẻ lừa đảo, những người cuối cùng đã bán Jim cho một nông dân địa phương, người hóa ra là Silas, chú của Tom Sawyer. Mọi người nhầm lẫn Huck với Tom, và anh ta đã đồng hành với nó, nảy ra một kế hoạch phức tạp để giải thoát Jim khi Tom đến. Trong nỗ lực trốn thoát của họ, Tom nhận được một vết thương do súng bắn, và các nhà chức trách đã bắt lại Jim. Tuy nhiên, sáng hôm sau, người ta tiết lộ rằng Huck không phải là Tom, Jim thực sự là một người tự do kể từ cái chết của cô Watson, và Pap đã chết, điều đó có nghĩa là mọi người được tự do trở về nhà để có một kết thúc hạnh phúc. Mặc dù Widow Douglas đề nghị nhận nuôi Huck, nhưng anh ta không quan tâm đến cuộc sống văn minh và cuối cùng bỏ chạy về hướng Tây."));
        listStory.add(new Story(R.drawable.truyennuocngoai2,"CUỘC PHIÊU LƯU CỦA SINBAD","James L. Novack","Sau hai năm lênh đênh biển khơi, Sinbad trở về nhà ở Baghdad, thành phố đã đổi khác rất nhiều so với lần cuối anh gặp. Hiện tại Baghdad đang nằm dưới sự cai trị của hoàng tử và quan tể tướng. Trong lúc bị nhốt vào nhà lao chờ bị xử trảm, Sinbad gặp lại người anh trai Doubar. Sau khi công chúa bị Turok bắt giữ, quốc vương Baghdad cho rằng Sinbad là con người duy nhất biết ai có khả năng đối đầu với Turok và giải cứu công chúa. Sinbad sau đó bị đem ra đoạn đầu đài, chờ xử chém. Cảnh hành quyết Sinbad được diễn ra cùng lúc với lễ cưới hoàng gia. Sinbad bị trói và dẫn ra pháp trường nhưng trong ánh mắt của anh luôn rạng ngời sức sống. Đao phủ quân vạm vỡ, trùm khăn màu đen hỏi anh có muốn nói điều gì không và anh hiên ngang nói là “vẫn chưa chấm dứt cho đến khi…”\n" +
                "Lúc đao phủ vung rìu lên để chặt đầu, Doubar đã đến giải thoát cho anh. Hai anh em gặp lại đoàn thủy thủ còn lại của con tàu, yêu cầu sự giúp đỡ của họ, chỉ dẫn của Doubar, thầy Dim-Dim và bắt đầu hành trình đến hang ổ của Turok truy cứu công chúa Adena. Họ đi đến Đảo Bình Minh, nơi Sinbad sống để gặp thầy Dim-Dim và cô học việc mới, Maeve, cùng với bạn chim diều hâu Dermott. Cũng tại hòn đảo này, Dim-Dim đột ngột biến mất và có dấu hiệu tà thuật của Turok, Maeve quyết định gia nhập chuyến hành trình để tìm kiếm người thầy. Sau đó họ đã đến và giết Turok, trong phút lơ đãng của cô con gái Rumina. Và từ đó, Rumina quyết tâm dấn sâu vào cái ác để giành được tình yêu của Sinbad và trả thù cho người cha quá cố. Đối đầu về phép thuật của cô là Maeve, nhưng sau đó Maeve bị Rumina và quỷ Satăng hãm hại. Một trận bão dữ dội kéo đến khi ấy làm cả con thuyền chao đảo, nó đã cuốn Maeve xuống lòng đại dương và những người còn lại dạt vào bờ. Sáng hôm sau mọi người tỉnh dậy và nỗ lực tìm Maeve trong vô vọng, nhưng tình cờ họ tìm được một cô gái nằm trong hang có đeo chiếc vòng định mệnh (vòng cầu vồng) giống hệt của Sinbad và Doubar (tiếp sau này là samurai Tetsu). Bryn, tên cô gái đó, hoàn toàn không nhớ gì về quá khứ của mình đã gia nhập hải đoàn thay thế vai trò của Maeve. Chuyến hành trình giờ đây không chỉ đơn thuần giải cứu Dim-Dim mà còn có cả Maeve, người Sinbad nảy sinh tình cảm, và bí mật chiếc vòng định mệnh."));
        listStory.add(new Story(R.drawable.truyennuocngoai3,"CUỘC PHIÊU LƯU KỲ LẠ CỦA ĐOÀN BARSAC","Jules Verne","Trong một chuyến thám hiểm và lòng Châu Phi, đoàn thám hiểm với người đứng đầu là Barsac đã cóchuyếnduhành vào một thành phố bí ẩn giữa lòng sa mạc Sahara. \n" +
                "\n" +
                "Thành phố phát triển này là do một nhà khoa học thông minh nhưng đầy tham vọng đen tối xây nên. Sức tưởng tượng của Jules Verne kết hợp với kiến thức khoa học đã tôn vinh những thành tựu tuyệt diệu của con người, và cũng cho thấy những thành tựu ấy chỉ nở hoa và trường tồn khi phục vụ cho mục đích tốt đẹp.\n" +
                "***\n" +
                "Jules Gabriel Verne sinh ngày 8 tháng 2 năm 1828 tại Pháp và được coi là cha đẻ của thể loại Khoa học viễn tưởng.\n" +
                "\n" +
                "Để theo đuổi việc viết văn, Jules Verne đã bỏ học luật, nghề cha ông định hướng. Cuốn tiểu thuyết đầu tay thành công Năm tuần trên khinh khí cầu (1863) đã mở đầu cho hàng loạt các tác phẩm nổi tiếng về sau của Jules Verne như Cuộc Thám Hiểm Vào Lòng Đất (1864), Hai vạn dặm dưới biển (1870), 80 Ngày Vòng Quanh Thế Giới (1873)… Các  tác phẩm của ông được dịch khắp nơi trên thế giới.\n" +
                "\n" +
                "Jules Verne mất ngày 24 tháng 3 năm 1905. Sau khi ông qua đời, nhiều tiểu thuyết chưa in của ông vẫn được tiếp tục xuất bản.\n" +
                "***\n" +
                "Sau khi đã khóa chặt cửa, những người trốn chạy lo săn sóc các thương binh. Với sự giúp đỡ của Barsac và Amédée Florence – chính anh cũng bị thương nhẹ. – Jane chăm sóc những người mà số phận trớ trêu đã đưa đẩy họ đến chỗ ở của kẻ thù tàn bạo của họ.\n" +
                "\n" +
                "Khi việc băng bó đã xong, thì cô gái lại phải lo cho những người bất hạnh, bị cái đói hành hạ mấy ngày nay, ăn uống. Sau hồi lùng sục thức ăn ở khắp tất cả các tầng, mọi người cũng đã được ăn uống chút đỉnh. Nhưng tình thế vẫn hết sức nghiêm trọng, giờ cáo chung không thể tránh khỏi dường như chỉ kéo dài thêm mấy tiếng đồng hồ.\n" +
                "\n" +
                "Mười một giờ trưa. Các vụ nổ vẫn tiếp tục, trên bãi đáp nghe rõ tiếng la hét của các Chàng trai Vui tính, thỉnh thoảng chúng lại phí công công phá cánh cửa, còn từ trên sân hiên thì vọng xuống tiếng chửi bới của William Ferney và đồng bọn của hắn, song những người chạy trốn ý thức được rằng pháo đài của họ gần như là bất khả xâm phạm.\n" +
                "\n" +
                "Vừa mới được rảnh tay là Jane Buxton hỏi ngay Amédée Florence lý do họ rời khỏi nhà máy và đánh nhau trong điều kiện không cân sức như thế ngoài bãi đáp. Chàng phóng viên kể lại những gì đã xảy ra sau khi nàng đi khỏi. Anh kể rằng cuối cùng Tongané đã phát tín hiệu hằng mong đợi và Marcel Camaret đã chuyển sang khu giữa một vài gói thuốc nổ cùng với nhiều gươm đao, giáo mác. Sau đó những người bị bao vây tập trung đến cửa chính, sẵn sàng lao vào trận đánh khi nó bắt đầu."));

    }
}
