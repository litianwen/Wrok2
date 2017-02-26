package com.example.networkmusic.Utils;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/7/20.
 */
public class HotBean {


    /**
     * pagebean : {"color":6316128,"currentPage":1,"ret_code":0,"songlist":[{"albumid":989994,"albummid":"003y8dsH2wBHlo","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/l/o/003y8dsH2wBHlo.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/l/o/003y8dsH2wBHlo.jpg","downUrl":"http://tsmusic24.tc.qq.com/102636799.mp3","seconds":261,"singerid":5062,"singername":"薛之谦","songid":102636799,"songname":"演员","url":"http://ws.stream.qqmusic.qq.com/102636799.m4a?fromtag=46"},{"albumid":1376305,"albummid":"000dcZ9I1nzO62","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/6/2/000dcZ9I1nzO62.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/6/2/000dcZ9I1nzO62.jpg","downUrl":"http://tsmusic24.tc.qq.com/107192538.mp3","seconds":250,"songid":107192538,"songname":"刚刚好","url":"http://ws.stream.qqmusic.qq.com/107192538.m4a?fromtag=46"},{"albumid":1190139,"albummid":"0008wVjT0MSG3T","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/3/T/0008wVjT0MSG3T.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/3/T/0008wVjT0MSG3T.jpg","downUrl":"http://tsmusic24.tc.qq.com/104862561.mp3","seconds":249,"singerid":1043567,"singername":"韩安旭","songid":104862561,"songname":"多幸运","url":"http://ws.stream.qqmusic.qq.com/104862561.m4a?fromtag=46"},{"albumid":1023582,"albummid":"001xpUdt2jEjWu","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/W/u/001xpUdt2jEjWu.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/W/u/001xpUdt2jEjWu.jpg","downUrl":"http://tsmusic24.tc.qq.com/102793935.mp3","seconds":264,"singerid":11733,"singername":"BIGBANG (빅뱅)","songid":102793935,"songname":"IF YOU","url":"http://ws.stream.qqmusic.qq.com/102793935.m4a?fromtag=46"},{"albumid":435269,"albummid":"004AhJHV3slLjN","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/j/N/004AhJHV3slLjN.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/j/N/004AhJHV3slLjN.jpg","downUrl":"http://tsmusic24.tc.qq.com/5016168.mp3","seconds":273,"singerid":60505,"singername":"李荣浩","songid":5016168,"songname":"李白","url":"http://ws.stream.qqmusic.qq.com/5016168.m4a?fromtag=46"},{"albumid":1182135,"albummid":"003Epoc63Lyhjc","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/j/c/003Epoc63Lyhjc.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/j/c/003Epoc63Lyhjc.jpg","downUrl":"http://tsmusic24.tc.qq.com/104783753.mp3","seconds":266,"singerid":11608,"singername":"杨宗纬","songid":104783753,"songname":"一次就好 (《夏洛特烦恼》电影暖水曲)","url":"http://ws.stream.qqmusic.qq.com/104783753.m4a?fromtag=46"},{"albumid":1181138,"albummid":"003R9HsC0XREW6","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/W/6/003R9HsC0XREW6.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/W/6/003R9HsC0XREW6.jpg","downUrl":"http://tsmusic24.tc.qq.com/104772455.mp3","seconds":268,"singerid":89698,"singername":"庄心妍","songid":104772455,"songname":"走着走着就散了","url":"http://ws.stream.qqmusic.qq.com/104772455.m4a?fromtag=46"},{"albumid":1209306,"albummid":"0032wsE33S0oXx","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/X/x/0032wsE33S0oXx.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/X/x/0032wsE33S0oXx.jpg","downUrl":"http://tsmusic24.tc.qq.com/104936872.mp3","seconds":226,"singerid":63938,"singername":"张赫宣","songid":104936872,"songname":"我们不该这样的 (《北上广不相信眼泪》电视剧片尾曲)","url":"http://ws.stream.qqmusic.qq.com/104936872.m4a?fromtag=46"},{"albumid":644836,"albummid":"004J7mBW4Kpxsx","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/x/004J7mBW4Kpxsx.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/x/004J7mBW4Kpxsx.jpg","downUrl":"http://tsmusic24.tc.qq.com/7072290.mp3","seconds":301,"singerid":4442,"singername":"朴树","songid":7072290,"songname":"平凡之路 (《后会无期》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/7072290.m4a?fromtag=46"},{"albumid":982515,"albummid":"003YaJPm3IojAP","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/A/P/003YaJPm3IojAP.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/A/P/003YaJPm3IojAP.jpg","downUrl":"http://tsmusic24.tc.qq.com/102349482.mp3","seconds":325,"singerid":137,"singername":"那英","songid":102349482,"songname":"默 (《何以笙箫默》电影插曲)","url":"http://ws.stream.qqmusic.qq.com/102349482.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/102425546.mp3","seconds":290,"songid":102425546,"songname":"绅士","url":"http://ws.stream.qqmusic.qq.com/102425546.m4a?fromtag=46"},{"albumid":962606,"albummid":"0039Pp2W372JsM","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/M/0039Pp2W372JsM.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/M/0039Pp2W372JsM.jpg","downUrl":"http://tsmusic24.tc.qq.com/102193601.mp3","seconds":229,"singerid":12978,"singername":"Wiz Khalifa","songid":102193601,"songname":"See You Again (《速度与激情7》电影主题曲|《速度与激情7》电影片尾曲)","url":"http://ws.stream.qqmusic.qq.com/102193601.m4a?fromtag=46"},{"albumid":97619,"albummid":"001FFpMe09To1V","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/1/V/001FFpMe09To1V.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/1/V/001FFpMe09To1V.jpg","downUrl":"http://tsmusic24.tc.qq.com/1166273.mp3","seconds":230,"songid":1166273,"songname":"Fantastic Baby","url":"http://ws.stream.qqmusic.qq.com/1166273.m4a?fromtag=46"},{"albumid":1211728,"albummid":"002Nt51E0q8Zoo","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/o/o/002Nt51E0q8Zoo.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/o/o/002Nt51E0q8Zoo.jpg","downUrl":"http://tsmusic24.tc.qq.com/105030812.mp3","seconds":212,"singerid":944940,"singername":"Alan Walker","songid":105030812,"songname":"Faded","url":"http://ws.stream.qqmusic.qq.com/105030812.m4a?fromtag=46"},{"albumid":983279,"albummid":"00078fT84A2h6x","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/6/x/00078fT84A2h6x.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/6/x/00078fT84A2h6x.jpg","downUrl":"http://tsmusic24.tc.qq.com/102376507.mp3","seconds":219,"songid":102376507,"songname":"LOSER","url":"http://ws.stream.qqmusic.qq.com/102376507.m4a?fromtag=46"},{"albumid":648097,"albummid":"0006ftqt2nAMYV","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/Y/V/0006ftqt2nAMYV.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/Y/V/0006ftqt2nAMYV.jpg","downUrl":"http://tsmusic24.tc.qq.com/9058628.mp3","seconds":235,"singerid":4983,"singername":"Maroon 5","songid":9058628,"songname":"Sugar (2015年维多利亚的秘密泳装秀秀场音乐)","url":"http://ws.stream.qqmusic.qq.com/9058628.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/5016169.mp3","seconds":306,"songid":5016169,"songname":"模特","url":"http://ws.stream.qqmusic.qq.com/5016169.m4a?fromtag=46"},{"albumid":31526,"albummid":"003yQidc3s7P65","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/6/5/003yQidc3s7P65.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/6/5/003yQidc3s7P65.jpg","downUrl":"http://tsmusic24.tc.qq.com/1313990.mp3","seconds":239,"singerid":143,"singername":"陈奕迅","songid":1313990,"songname":"红玫瑰 (《白玫瑰》国语版)","url":"http://ws.stream.qqmusic.qq.com/1313990.m4a?fromtag=46"},{"albumid":438865,"albummid":"003iLv4M4QxxX7","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/X/7/003iLv4M4QxxX7.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/X/7/003iLv4M4QxxX7.jpg","downUrl":"http://tsmusic24.tc.qq.com/5114766.mp3","seconds":225,"singerid":28227,"singername":"马旭东","songid":5114766,"songname":"入戏太深","url":"http://ws.stream.qqmusic.qq.com/5114766.m4a?fromtag=46"},{"albumid":1267462,"albummid":"000I4CFA03SRGW","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/G/W/000I4CFA03SRGW.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/G/W/000I4CFA03SRGW.jpg","downUrl":"http://tsmusic24.tc.qq.com/105460886.mp3","seconds":296,"singerid":60433,"singername":"好妹妹乐队","songid":105460886,"songname":"不说再见 (《谁的青春不迷茫》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105460886.m4a?fromtag=46"},{"albumid":55085,"albummid":"0036fT613sAeZn","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/Z/n/0036fT613sAeZn.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/Z/n/0036fT613sAeZn.jpg","downUrl":"http://tsmusic24.tc.qq.com/647969.mp3","songid":647969,"songname":"认真的雪 (《妈妈像花儿一样》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/647969.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/107439472.mp3","seconds":279,"songid":107439472,"songname":"我好像在哪见过你 (《精灵王座》动画电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/107439472.m4a?fromtag=46"},{"albumid":992502,"albummid":"003UYgaO2wuwht","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/h/t/003UYgaO2wuwht.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/h/t/003UYgaO2wuwht.jpg","downUrl":"http://tsmusic24.tc.qq.com/102629053.mp3","seconds":220,"songid":102629053,"songname":"뱅뱅뱅 (BANG BANG BANG) (《全民超神》游戏主题曲)","url":"http://ws.stream.qqmusic.qq.com/102629053.m4a?fromtag=46"},{"albumid":1501519,"albummid":"0000RUY62pVyVu","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/V/u/0000RUY62pVyVu.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/V/u/0000RUY62pVyVu.jpg","downUrl":"http://tsmusic24.tc.qq.com/107541569.mp3","singerid":34412,"singername":"TFBOYS","songid":107541569,"songname":"未来的进击 (《超少年密码》网络剧主题曲)","url":"http://ws.stream.qqmusic.qq.com/107541569.m4a?fromtag=46"},{"albumid":1047807,"albummid":"003C2NkS1qpM7U","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/7/U/003C2NkS1qpM7U.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/7/U/003C2NkS1qpM7U.jpg","downUrl":"http://tsmusic24.tc.qq.com/102954020.mp3","seconds":211,"songid":102954020,"songname":"Let's not fall in love (우리 사랑하지 말아요)","url":"http://ws.stream.qqmusic.qq.com/102954020.m4a?fromtag=46"},{"albumid":1334362,"albummid":"003t7fZl36UCVe","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/V/e/003t7fZl36UCVe.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/V/e/003t7fZl36UCVe.jpg","downUrl":"http://tsmusic24.tc.qq.com/105974515.mp3","seconds":234,"singerid":69205,"singername":"南征北战","songid":105974515,"songname":"我的天空","url":"http://ws.stream.qqmusic.qq.com/105974515.m4a?fromtag=46"},{"albumid":38748,"albummid":"000cchEp2CGNEf","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/E/f/000cchEp2CGNEf.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/E/f/000cchEp2CGNEf.jpg","downUrl":"http://tsmusic24.tc.qq.com/7063431.mp3","seconds":313,"singerid":16244,"singername":"徐佳莹","songid":7063431,"songname":"身骑白马","url":"http://ws.stream.qqmusic.qq.com/7063431.m4a?fromtag=46"},{"albumid":779932,"albummid":"0036eU2A4VBjo2","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/o/2/0036eU2A4VBjo2.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/o/2/0036eU2A4VBjo2.jpg","downUrl":"http://tsmusic24.tc.qq.com/9103820.mp3","seconds":240,"singername":"王菲","songid":9103820,"songname":"匆匆那年 (《匆匆那年》电影同名主题曲)","url":"http://ws.stream.qqmusic.qq.com/9103820.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/7063432.mp3","seconds":299,"songid":7063432,"songname":"失落沙洲","url":"http://ws.stream.qqmusic.qq.com/7063432.m4a?fromtag=46"},{"albumid":447027,"albummid":"004CtizV0JRIx7","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/x/7/004CtizV0JRIx7.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/x/7/004CtizV0JRIx7.jpg","downUrl":"http://tsmusic24.tc.qq.com/5080232.mp3","seconds":228,"singerid":40798,"singername":"齐晨","songid":5080232,"songname":"咱们结婚吧","url":"http://ws.stream.qqmusic.qq.com/5080232.m4a?fromtag=46"},{"albumid":65014,"albummid":"000Nlo922ahOEE","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/E/E/000Nlo922ahOEE.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/E/E/000Nlo922ahOEE.jpg","downUrl":"http://tsmusic24.tc.qq.com/777554.mp3","seconds":285,"singerid":6028,"singername":"A-Lin","songid":777554,"songname":"给我一个理由忘记","url":"http://ws.stream.qqmusic.qq.com/777554.m4a?fromtag=46"},{"albumid":1276189,"albummid":"001fi1zG0EjU2u","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/2/u/001fi1zG0EjU2u.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/2/u/001fi1zG0EjU2u.jpg","downUrl":"http://tsmusic24.tc.qq.com/102367085.mp3","seconds":312,"songid":102367085,"songname":"不将就 (《何以笙箫默》电影片尾曲)","url":"http://ws.stream.qqmusic.qq.com/102367085.m4a?fromtag=46"},{"albumid":654246,"albummid":"000cFPKx3ZGzks","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/k/s/000cFPKx3ZGzks.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/k/s/000cFPKx3ZGzks.jpg","downUrl":"http://tsmusic24.tc.qq.com/7168586.mp3","singerid":13948,"singername":"G.E.M. 邓紫棋","songid":7168586,"songname":"喜欢你 (原唱：Beyond)","url":"http://ws.stream.qqmusic.qq.com/7168586.m4a?fromtag=46"},{"albumid":932734,"albummid":"000Hqm2N0vOPYg","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/Y/g/000Hqm2N0vOPYg.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/Y/g/000Hqm2N0vOPYg.jpg","downUrl":"http://tsmusic24.tc.qq.com/101835195.mp3","seconds":183,"singerid":943468,"singername":"萌萌哒天团","songid":101835195,"songname":"帝都","url":"http://ws.stream.qqmusic.qq.com/101835195.m4a?fromtag=46"},{"albumid":1196806,"albummid":"0016Cw6n3PXsxG","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/x/G/0016Cw6n3PXsxG.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/x/G/0016Cw6n3PXsxG.jpg","downUrl":"http://tsmusic24.tc.qq.com/104919028.mp3","seconds":201,"singerid":180646,"singername":"吴亦凡","songid":104919028,"songname":"Bad Girl","url":"http://ws.stream.qqmusic.qq.com/104919028.m4a?fromtag=46"},{"albumid":89526,"albummid":"000GDz8k03UOaI","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/a/I/000GDz8k03UOaI.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/a/I/000GDz8k03UOaI.jpg","downUrl":"http://tsmusic24.tc.qq.com/4830342.mp3","seconds":205,"songid":4830342,"songname":"十年 (《明年今日》国语版|《隐婚男女》电影插曲)","url":"http://ws.stream.qqmusic.qq.com/4830342.m4a?fromtag=46"},{"albumid":1326041,"albummid":"002Ibq0k31FYiu","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/i/u/002Ibq0k31FYiu.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/i/u/002Ibq0k31FYiu.jpg","downUrl":"http://tsmusic24.tc.qq.com/105909271.mp3","seconds":295,"singerid":4607,"singername":"张靓颖","songid":105909271,"songname":"只是没有如果 (《那年青春我们正好》电视剧片尾曲)","url":"http://ws.stream.qqmusic.qq.com/105909271.m4a?fromtag=46"},{"albumid":7998,"albummid":"000lrk6m1fk7tl","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/t/l/000lrk6m1fk7tl.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/t/l/000lrk6m1fk7tl.jpg","downUrl":"http://tsmusic24.tc.qq.com/95199.mp3","singerid":3376,"singername":"许巍","songid":95199,"songname":"曾经的你 (《夏洛特烦恼》电影插曲)","url":"http://ws.stream.qqmusic.qq.com/95199.m4a?fromtag=46"},{"albumid":930290,"albummid":"000YgAKk1pRwSr","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/S/r/000YgAKk1pRwSr.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/S/r/000YgAKk1pRwSr.jpg","downUrl":"http://tsmusic24.tc.qq.com/101125834.mp3","seconds":232,"singerid":204664,"singername":"鹿晗","songid":101125834,"songname":"我们的明天 (《重返20岁》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/101125834.m4a?fromtag=46"},{"albumid":62342,"albummid":"000TuW8h0AH2n4","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/n/4/000TuW8h0AH2n4.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/n/4/000TuW8h0AH2n4.jpg","downUrl":"http://tsmusic24.tc.qq.com/102415346.mp3","seconds":320,"singerid":4286,"singername":"林俊杰","songid":102415346,"songname":"她说 (《爱情睡醒了》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/102415346.m4a?fromtag=46"},{"albumid":849441,"albummid":"003cWrpu4T056m","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/6/m/003cWrpu4T056m.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/6/m/003cWrpu4T056m.jpg","downUrl":"http://tsmusic24.tc.qq.com/101092330.mp3","seconds":245,"singerid":940376,"singername":"GD X TAEYANG","songid":101092330,"songname":"GOOD BOY","url":"http://ws.stream.qqmusic.qq.com/101092330.m4a?fromtag=46"},{"albumid":1021908,"albummid":"004CpScU2yCHtl","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/t/l/004CpScU2yCHtl.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/t/l/004CpScU2yCHtl.jpg","downUrl":"http://tsmusic24.tc.qq.com/102689038.mp3","songid":102689038,"songname":"Animals (2015年维多利亚的秘密泳装秀秀场音乐)","url":"http://ws.stream.qqmusic.qq.com/102689038.m4a?fromtag=46"},{"albumid":454263,"albummid":"001Yai8e3Ju7xu","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/x/u/001Yai8e3Ju7xu.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/x/u/001Yai8e3Ju7xu.jpg","downUrl":"http://tsmusic24.tc.qq.com/7228566.mp3","seconds":300,"songid":7228566,"songname":"以后的以后","url":"http://ws.stream.qqmusic.qq.com/7228566.m4a?fromtag=46"},{"albumid":646647,"albummid":"002tiWru4dhByO","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/y/O/002tiWru4dhByO.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/y/O/002tiWru4dhByO.jpg","downUrl":"http://tsmusic24.tc.qq.com/7094168.mp3","seconds":263,"songid":7094168,"songname":"青春修炼手册","url":"http://ws.stream.qqmusic.qq.com/7094168.m4a?fromtag=46"},{"albumid":852443,"albummid":"001IV22P1RDX7p","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/7/p/001IV22P1RDX7p.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/7/p/001IV22P1RDX7p.jpg","downUrl":"http://tsmusic24.tc.qq.com/101555425.mp3","seconds":298,"songid":101555425,"songname":"可惜没如果 (《杜鹃之巢》韩剧中文主题曲|《对我而言，可爱的她》韩剧中文片尾曲)","url":"http://ws.stream.qqmusic.qq.com/101555425.m4a?fromtag=46"},{"albumid":35182,"albummid":"000J1pJ50cDCVE","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/V/E/000J1pJ50cDCVE.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/V/E/000J1pJ50cDCVE.jpg","downUrl":"http://tsmusic24.tc.qq.com/9059607.mp3","songid":9059607,"songname":"不要说话","url":"http://ws.stream.qqmusic.qq.com/9059607.m4a?fromtag=46"},{"albumid":141889,"albummid":"000KdeES4gb2yb","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/y/b/000KdeES4gb2yb.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/y/b/000KdeES4gb2yb.jpg","downUrl":"http://tsmusic24.tc.qq.com/4830911.mp3","seconds":277,"singerid":23080,"singername":"李行亮","songid":4830911,"songname":"愿得一人心 (《最美的时光》电视剧主题曲)","url":"http://ws.stream.qqmusic.qq.com/4830911.m4a?fromtag=46"},{"albumid":1147271,"albummid":"002hgsbR1NFFdx","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/d/x/002hgsbR1NFFdx.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/d/x/002hgsbR1NFFdx.jpg","downUrl":"http://tsmusic24.tc.qq.com/104251904.mp3","seconds":191,"songid":104251904,"songname":"致爱 Your Song","url":"http://ws.stream.qqmusic.qq.com/104251904.m4a?fromtag=46"},{"albumid":304909,"albummid":"003W5t102sjVNj","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/N/j/003W5t102sjVNj.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/N/j/003W5t102sjVNj.jpg","downUrl":"http://tsmusic24.tc.qq.com/3596006.mp3","singerid":34703,"singername":"曲婉婷","songid":3596006,"songname":"Jar Of Love","url":"http://ws.stream.qqmusic.qq.com/3596006.m4a?fromtag=46"},{"albumid":642432,"albummid":"000xWexl4IDgp7","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/p/7/000xWexl4IDgp7.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/p/7/000xWexl4IDgp7.jpg","downUrl":"http://tsmusic24.tc.qq.com/7079906.mp3","seconds":248,"songid":7079906,"songname":"时间煮雨 (《小时代3：刺金时代》电影片尾曲|《小时代4：灵魂尽头》电影宣传曲|《小时代4：灵魂尽头》电影插曲)","url":"http://ws.stream.qqmusic.qq.com/7079906.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/1313992.mp3","seconds":259,"songid":1313992,"songname":"爱情转移 (《爱情呼叫转移》电影主题曲|《富士山下》国语版)","url":"http://ws.stream.qqmusic.qq.com/1313992.m4a?fromtag=46"},{"albumid":1199649,"albummid":"0023ogVJ3PxZ12","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/1/2/0023ogVJ3PxZ12.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/1/2/0023ogVJ3PxZ12.jpg","downUrl":"http://tsmusic24.tc.qq.com/104942240.mp3","seconds":221,"singerid":160949,"singername":"贾乃亮","songid":104942240,"songname":"大王叫我来巡山 (《万万没想到：西游篇》电影片尾曲)","url":"http://ws.stream.qqmusic.qq.com/104942240.m4a?fromtag=46"},{"albumid":1267526,"albummid":"001uMCZE0lJIWr","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/W/r/001uMCZE0lJIWr.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/W/r/001uMCZE0lJIWr.jpg","downUrl":"http://tsmusic24.tc.qq.com/105461543.mp3","seconds":260,"songid":105461543,"songname":"不完美小孩","url":"http://ws.stream.qqmusic.qq.com/105461543.m4a?fromtag=46"},{"albumid":992081,"albummid":"0044dYsD2Y0lfN","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/N/0044dYsD2Y0lfN.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/N/0044dYsD2Y0lfN.jpg","downUrl":"http://tsmusic24.tc.qq.com/102677326.mp3","seconds":274,"singerid":199515,"singername":"张碧晨","songid":102677326,"songname":"年轮 (《花千骨》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/102677326.m4a?fromtag=46"},{"albumid":1283389,"albummid":"003OaQL62OJZHH","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/H/H/003OaQL62OJZHH.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/H/H/003OaQL62OJZHH.jpg","downUrl":"http://tsmusic24.tc.qq.com/107360025.mp3","singerid":13410,"singername":"윤미래 (尹美莱)","songid":107360025,"songname":"ALWAYS (《太阳的后裔》韩剧主题曲)","url":"http://ws.stream.qqmusic.qq.com/107360025.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/7071189.mp3","seconds":244,"singerid":166260,"singername":"陈学冬","songid":7071189,"songname":"不再见 (《小时代3：刺金时代》电影插曲|《小时代4：灵魂尽头》电影插曲)","url":"http://ws.stream.qqmusic.qq.com/7071189.m4a?fromtag=46"},{"albumid":528091,"albummid":"000owywt4caGcV","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/c/V/000owywt4caGcV.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/c/V/000owywt4caGcV.jpg","downUrl":"http://tsmusic24.tc.qq.com/5645193.mp3","singerid":11761,"singername":"筷子兄弟","songid":5645193,"songname":"小苹果 (《老男孩之猛龙过江》电影宣传曲)","url":"http://ws.stream.qqmusic.qq.com/5645193.m4a?fromtag=46"},{"albumid":1300611,"albummid":"000P2dOY49TrFY","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/F/Y/000P2dOY49TrFY.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/F/Y/000P2dOY49TrFY.jpg","downUrl":"http://tsmusic24.tc.qq.com/107360329.mp3","seconds":216,"singerid":11353,"singername":"케이윌 (K.Will)","songid":107360329,"songname":"말해! 뭐해? (说！ 干什么？) (《太阳的后裔》韩剧插曲)","url":"http://ws.stream.qqmusic.qq.com/107360329.m4a?fromtag=46"},{"albumid":436639,"albummid":"003xpVKT3C9KpA","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/p/A/003xpVKT3C9KpA.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/p/A/003xpVKT3C9KpA.jpg","downUrl":"http://tsmusic24.tc.qq.com/5026823.mp3","singerid":19851,"singername":"G-DRAGON (权志龙)","songid":5026823,"songname":"삐딱하게 (狂放)","url":"http://ws.stream.qqmusic.qq.com/5026823.m4a?fromtag=46"},{"albumid":123298,"albummid":"002YFufr4bXZyI","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/y/I/002YFufr4bXZyI.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/y/I/002YFufr4bXZyI.jpg","downUrl":"http://tsmusic24.tc.qq.com/1530858.mp3","seconds":258,"songid":1530858,"songname":"泡沫","url":"http://ws.stream.qqmusic.qq.com/1530858.m4a?fromtag=46"},{"albumid":1387962,"albummid":"004Y7V4s3ug4cC","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/c/C/004Y7V4s3ug4cC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/c/C/004Y7V4s3ug4cC.jpg","downUrl":"http://tsmusic24.tc.qq.com/106484214.mp3","singerid":199509,"singername":"周深","songid":106484214,"songname":"大鱼 (《大鱼海棠》动画电影印象曲)","url":"http://ws.stream.qqmusic.qq.com/106484214.m4a?fromtag=46"},{"albumid":435099,"albummid":"0012n4e81OIID6","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/D/6/0012n4e81OIID6.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/D/6/0012n4e81OIID6.jpg","downUrl":"http://tsmusic24.tc.qq.com/9148669.mp3","seconds":214,"singerid":34059,"singername":"刘思涵","songid":9148669,"songname":"走在冷风中","url":"http://ws.stream.qqmusic.qq.com/9148669.m4a?fromtag=46"},{"albumid":1285941,"albummid":"0001iCUt0DzsWg","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/W/g/0001iCUt0DzsWg.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/W/g/0001iCUt0DzsWg.jpg","downUrl":"http://tsmusic24.tc.qq.com/107360054.mp3","seconds":189,"singerid":177218,"singername":"첸 (Chen)","songid":107360054,"songname":"Everytime (《太阳的后裔》韩剧插曲)","url":"http://ws.stream.qqmusic.qq.com/107360054.m4a?fromtag=46"},{"albumid":121852,"albummid":"001mat8F3tAzsu","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/u/001mat8F3tAzsu.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/u/001mat8F3tAzsu.jpg","downUrl":"http://tsmusic24.tc.qq.com/1511180.mp3","seconds":206,"singerid":12926,"singername":"Owl City","songid":1511180,"songname":"Good Time","url":"http://ws.stream.qqmusic.qq.com/1511180.m4a?fromtag=46"},{"albumid":8036,"albummid":"000y5gq7449K9I","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/9/I/000y5gq7449K9I.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/9/I/000y5gq7449K9I.jpg","downUrl":"http://tsmusic24.tc.qq.com/9063002.mp3","seconds":267,"songid":9063002,"songname":"江南","url":"http://ws.stream.qqmusic.qq.com/9063002.m4a?fromtag=46"},{"albumid":458833,"albummid":"004F2qia1UXsxp","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/x/p/004F2qia1UXsxp.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/x/p/004F2qia1UXsxp.jpg","downUrl":"http://tsmusic24.tc.qq.com/4969759.mp3","seconds":238,"singerid":3758,"singername":"赖伟锋","songid":4969759,"songname":"闹够了没有","url":"http://ws.stream.qqmusic.qq.com/4969759.m4a?fromtag=46"},{"albumid":607639,"albummid":"003qgLUt07WXVS","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/V/S/003qgLUt07WXVS.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/V/S/003qgLUt07WXVS.jpg","downUrl":"http://tsmusic24.tc.qq.com/6588458.mp3","songid":6588458,"songname":"Maps","url":"http://ws.stream.qqmusic.qq.com/6588458.m4a?fromtag=46"},{"albumid":485767,"albummid":"003rytri2FHG3V","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/3/V/003rytri2FHG3V.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/3/V/003rytri2FHG3V.jpg","downUrl":"http://tsmusic24.tc.qq.com/5536869.mp3","songid":5536869,"songname":"阴天快乐","url":"http://ws.stream.qqmusic.qq.com/5536869.m4a?fromtag=46"},{"albumid":436025,"albummid":"002VeS6r4L5fLZ","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/L/Z/002VeS6r4L5fLZ.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/L/Z/002VeS6r4L5fLZ.jpg","downUrl":"http://tsmusic24.tc.qq.com/5002692.mp3","seconds":253,"singerid":61620,"singername":"宋冬野","songid":5002692,"songname":"斑马，斑马","url":"http://ws.stream.qqmusic.qq.com/5002692.m4a?fromtag=46"},{"albumid":8220,"albummid":"000MkMni19ClKG","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/K/G/000MkMni19ClKG.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/K/G/000MkMni19ClKG.jpg","downUrl":"http://tsmusic24.tc.qq.com/97773.mp3","seconds":269,"singerid":4558,"singername":"周杰伦","songid":97773,"songname":"晴天","url":"http://ws.stream.qqmusic.qq.com/97773.m4a?fromtag=46"},{"albumid":1145929,"albummid":"0010bzpH1ZBuvY","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/v/Y/0010bzpH1ZBuvY.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/v/Y/0010bzpH1ZBuvY.jpg","downUrl":"http://tsmusic24.tc.qq.com/104236476.mp3","seconds":280,"songid":104236476,"songname":"有个爱你的人不容易 (《夏洛特烦恼》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/104236476.m4a?fromtag=46"},{"albumid":36160,"albummid":"002g6zv02X7SNi","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/N/i/002g6zv02X7SNi.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/N/i/002g6zv02X7SNi.jpg","downUrl":"http://tsmusic24.tc.qq.com/447257.mp3","seconds":222,"songid":447257,"songname":"Always Online (联想idea Pad S9/S10笔记本主题曲)","url":"http://ws.stream.qqmusic.qq.com/447257.m4a?fromtag=46"},{"albumid":288517,"albummid":"0035f8nw11cjkf","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/k/f/0035f8nw11cjkf.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/k/f/0035f8nw11cjkf.jpg","downUrl":"http://tsmusic24.tc.qq.com/101813361.mp3","singerid":7221,"singername":"许嵩","songid":101813361,"songname":"素颜","url":"http://ws.stream.qqmusic.qq.com/101813361.m4a?fromtag=46"},{"albumid":963738,"albummid":"001vW4XA35QKKW","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/K/W/001vW4XA35QKKW.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/K/W/001vW4XA35QKKW.jpg","downUrl":"http://tsmusic24.tc.qq.com/102184416.mp3","singerid":16000,"singername":"萧全","songid":102184416,"songname":"社会摇","url":"http://ws.stream.qqmusic.qq.com/102184416.m4a?fromtag=46"},{"albumid":430607,"albummid":"0011bgXh3sQZ3Z","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/3/Z/0011bgXh3sQZ3Z.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/3/Z/0011bgXh3sQZ3Z.jpg","downUrl":"http://tsmusic24.tc.qq.com/4884947.mp3","seconds":324,"singerid":5924,"singername":"苏打绿","songid":4884947,"songname":"我好想你 (《小时代》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/4884947.m4a?fromtag=46"},{"albumid":603966,"albummid":"000dqTau0GYZdL","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/d/L/000dqTau0GYZdL.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/d/L/000dqTau0GYZdL.jpg","downUrl":"http://tsmusic24.tc.qq.com/106373418.mp3","singerid":39657,"singername":"魏新雨","songid":106373418,"songname":"恋人心","url":"http://ws.stream.qqmusic.qq.com/106373418.m4a?fromtag=46"},{"albumid":438038,"albummid":"003r2bws0U2gV0","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/V/0/003r2bws0U2gV0.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/V/0/003r2bws0U2gV0.jpg","downUrl":"http://tsmusic24.tc.qq.com/9082287.mp3","seconds":283,"singerid":43665,"singername":"梦然","songid":9082287,"songname":"没有你陪伴真的好孤单","url":"http://ws.stream.qqmusic.qq.com/9082287.m4a?fromtag=46"},{"albumid":53087,"albummid":"002dOge41xlS8x","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/8/x/002dOge41xlS8x.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/8/x/002dOge41xlS8x.jpg","downUrl":"http://tsmusic24.tc.qq.com/624649.mp3","singerid":112,"singername":"蔡健雅","songid":624649,"songname":"红色高跟鞋 (《爱情左右》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/624649.m4a?fromtag=46"},{"albumid":107514,"albummid":"001tsWa91KeHlz","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/l/z/001tsWa91KeHlz.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/l/z/001tsWa91KeHlz.jpg","downUrl":"http://tsmusic24.tc.qq.com/102217896.mp3","singerid":12740,"singername":"Flo Rida","songid":102217896,"songname":"Whistle","url":"http://ws.stream.qqmusic.qq.com/102217896.m4a?fromtag=46"},{"albumid":81708,"albummid":"000cNt5s0HBytP","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/t/P/000cNt5s0HBytP.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/t/P/000cNt5s0HBytP.jpg","downUrl":"http://tsmusic24.tc.qq.com/963579.mp3","seconds":198,"singerid":24561,"singername":"One Direction","songid":963579,"songname":"What Makes You Beautiful","url":"http://ws.stream.qqmusic.qq.com/963579.m4a?fromtag=46"},{"albumid":1456626,"albummid":"0032bxR52m4cgY","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/g/Y/0032bxR52m4cgY.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/g/Y/0032bxR52m4cgY.jpg","downUrl":"http://tsmusic24.tc.qq.com/107157506.mp3","songid":107157506,"songname":"Sing Me to Sleep","url":"http://ws.stream.qqmusic.qq.com/107157506.m4a?fromtag=46"},{"albumid":1266887,"albummid":"001rvkpT0so9Uk","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/U/k/001rvkpT0so9Uk.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/U/k/001rvkpT0so9Uk.jpg","downUrl":"http://tsmusic24.tc.qq.com/102210521.mp3","seconds":265,"songid":102210521,"songname":"宠爱","url":"http://ws.stream.qqmusic.qq.com/102210521.m4a?fromtag=46"},{"albumid":878,"albummid":"001Vdkw84cPdmT","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/m/T/001Vdkw84cPdmT.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/m/T/001Vdkw84cPdmT.jpg","downUrl":"http://tsmusic24.tc.qq.com/1431046.mp3","singername":"李克勤","songid":1431046,"songname":"月半小夜曲 (原曲：ハーフムーン·セレナーデ)","url":"http://ws.stream.qqmusic.qq.com/1431046.m4a?fromtag=46"},{"albumid":1473147,"albummid":"001jXlOo3g2oTM","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/T/M/001jXlOo3g2oTM.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/T/M/001jXlOo3g2oTM.jpg","downUrl":"http://tsmusic24.tc.qq.com/107298249.mp3","singerid":22874,"singername":"孙子涵","songid":107298249,"songname":"这孤独世界幸好有你 (《这孤独世界，幸好有你》同名书主题曲)","url":"http://ws.stream.qqmusic.qq.com/107298249.m4a?fromtag=46"},{"albumid":55148,"albummid":"001nuhFZ1F9CHr","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/H/r/001nuhFZ1F9CHr.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/H/r/001nuhFZ1F9CHr.jpg","downUrl":"http://tsmusic24.tc.qq.com/5665570.mp3","singerid":284,"singername":"陈势安","songid":5665570,"songname":"天后 (《面具》国语版|《同伊》电视剧片尾曲)","url":"http://ws.stream.qqmusic.qq.com/5665570.m4a?fromtag=46"},{"albumid":75139,"albummid":"003K4mFV3B9UfM","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/M/003K4mFV3B9UfM.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/M/003K4mFV3B9UfM.jpg","downUrl":"http://tsmusic24.tc.qq.com/7109361.mp3","seconds":271,"singerid":4422,"singername":"牛奶咖啡","songid":7109361,"songname":"明天，你好 (《加油吧实习生》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/7109361.m4a?fromtag=46"},{"albumid":1201,"albummid":"003oA2kD1ea7sz","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/z/003oA2kD1ea7sz.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/z/003oA2kD1ea7sz.jpg","downUrl":"http://tsmusic24.tc.qq.com/7264117.mp3","seconds":252,"singerid":167,"singername":"张信哲","songid":7264117,"songname":"信仰 (《匆匆那年》电影插曲)","url":"http://ws.stream.qqmusic.qq.com/7264117.m4a?fromtag=46"},{"albumid":951982,"albummid":"004GArUe26PXvZ","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/v/Z/004GArUe26PXvZ.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/v/Z/004GArUe26PXvZ.jpg","downUrl":"http://tsmusic24.tc.qq.com/102068222.mp3","singerid":940748,"singername":"陈粒","songid":102068222,"songname":"奇妙能力歌","url":"http://ws.stream.qqmusic.qq.com/102068222.m4a?fromtag=46"},{"albumid":10819,"albummid":"000eOgmK1fN8Cs","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/C/s/000eOgmK1fN8Cs.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/C/s/000eOgmK1fN8Cs.jpg","downUrl":"http://tsmusic24.tc.qq.com/1319248.mp3","seconds":275,"singerid":2,"singername":"BEYOND","songid":1319248,"songname":"真的爱你","url":"http://ws.stream.qqmusic.qq.com/1319248.m4a?fromtag=46"},{"albumid":496284,"albummid":"003BoDmC3jlPXT","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/X/T/003BoDmC3jlPXT.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/X/T/003BoDmC3jlPXT.jpg","downUrl":"http://tsmusic24.tc.qq.com/5026333.mp3","songid":5026333,"songname":"终于等到你 (《咱们结婚吧》电视剧主题曲)","url":"http://ws.stream.qqmusic.qq.com/5026333.m4a?fromtag=46"},{"albumid":36062,"albummid":"002Neh8l0uciQZ","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/Q/Z/002Neh8l0uciQZ.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/Q/Z/002Neh8l0uciQZ.jpg","downUrl":"http://tsmusic24.tc.qq.com/449205.mp3","seconds":223,"songid":449205,"songname":"稻香","url":"http://ws.stream.qqmusic.qq.com/449205.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/764255.mp3","songid":764255,"songname":"当你","url":"http://ws.stream.qqmusic.qq.com/764255.m4a?fromtag=46"},{"albumid":131825,"albummid":"0025Q9H30C0fBW","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/B/W/0025Q9H30C0fBW.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/B/W/0025Q9H30C0fBW.jpg","downUrl":"http://tsmusic24.tc.qq.com/4830437.mp3","seconds":208,"singerid":34560,"singername":"回音哥","songid":4830437,"songname":"海绵宝宝","url":"http://ws.stream.qqmusic.qq.com/4830437.m4a?fromtag=46"},{"albumid":33021,"albummid":"002eFUFm2XYZ7z","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/7/z/002eFUFm2XYZ7z.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/7/z/002eFUFm2XYZ7z.jpg","downUrl":"http://tsmusic24.tc.qq.com/410316.mp3","songid":410316,"songname":"青花瓷","url":"http://ws.stream.qqmusic.qq.com/410316.m4a?fromtag=46"},{"albumid":190688,"albummid":"000v2BGN2IQd5n","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/5/n/000v2BGN2IQd5n.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/5/n/000v2BGN2IQd5n.jpg","downUrl":"http://tsmusic24.tc.qq.com/4775804.mp3","seconds":243,"songid":4775804,"songname":"爱囚","url":"http://ws.stream.qqmusic.qq.com/4775804.m4a?fromtag=46"},{"albumid":38202,"albummid":"002dDK2v1LkvKq","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/K/q/002dDK2v1LkvKq.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/K/q/002dDK2v1LkvKq.jpg","downUrl":"http://tsmusic24.tc.qq.com/469833.mp3","seconds":272,"singerid":4365,"singername":"周传雄","songid":469833,"songname":"冬天的秘密","url":"http://ws.stream.qqmusic.qq.com/469833.m4a?fromtag=46"},{"albumid":1284401,"albummid":"001JRfhS4HLBLb","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/L/b/001JRfhS4HLBLb.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/L/b/001JRfhS4HLBLb.jpg","downUrl":"http://tsmusic24.tc.qq.com/105591618.mp3","seconds":197,"singerid":5077,"singername":"Shakira","songid":105591618,"songname":"Try Everything (《疯狂动物城》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105591618.m4a?fromtag=46"},{"albumid":1478524,"albummid":"000A2BKM3uGxh6","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/h/6/000A2BKM3uGxh6.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/h/6/000A2BKM3uGxh6.jpg","downUrl":"http://tsmusic24.tc.qq.com/107343486.mp3","seconds":231,"singerid":968691,"singername":"贺敬轩","songid":107343486,"songname":"毕业季","url":"http://ws.stream.qqmusic.qq.com/107343486.m4a?fromtag=46"},{"albumid":778079,"albummid":"0045GzEt0I9c3x","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/3/x/0045GzEt0I9c3x.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/3/x/0045GzEt0I9c3x.jpg","downUrl":"http://tsmusic24.tc.qq.com/101804789.mp3","singerid":171061,"singername":"马頔","songid":101804789,"songname":"南山南","url":"http://ws.stream.qqmusic.qq.com/101804789.m4a?fromtag=46"},{"albumid":1181889,"albummid":"002ZXwUj3RlnVN","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/V/N/002ZXwUj3RlnVN.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/V/N/002ZXwUj3RlnVN.jpg","downUrl":"http://tsmusic24.tc.qq.com/104780330.mp3","seconds":213,"songid":104780330,"songname":"勋章 (《我是证人》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/104780330.m4a?fromtag=46"}],"total_song_num":100}
     * ret_code : 0
     */

    private ShowapiResBodyBean showapi_res_body;

    @Override
    public String toString() {
        return "HotBean{" +
                "showapi_res_body=" + showapi_res_body +
                ", showapi_res_code=" + showapi_res_code +
                ", showapi_res_error='" + showapi_res_error + '\'' +
                '}';
    }


    private int showapi_res_code;
    private String showapi_res_error;

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }


    public static class ShowapiResBodyBean {

        @Override
        public String toString() {
            return "ShowapiResBodyBean{" +
                    "pagebean=" + pagebean +
                    ", ret_code=" + ret_code +
                    '}';
        }


        private PagebeanBean pagebean;
        private int ret_code;

        public PagebeanBean getPagebean() {
            return pagebean;
        }

        public void setPagebean(PagebeanBean pagebean) {
            this.pagebean = pagebean;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public static class PagebeanBean {

            @Override
            public String toString() {
                return "PagebeanBean{" +
                        "color=" + color +
                        ", currentPage=" + currentPage +
                        ", ret_code=" + ret_code +
                        ", total_song_num=" + total_song_num +
                        ", songlist=" + songlist +
                        '}';
            }

            private int color;
            private int currentPage;
            private int ret_code;
            private int total_song_num;
            /**
             * albumid : 989994
             * albummid : 003y8dsH2wBHlo
             * albumpic_big : http://i.gtimg.cn/music/photo/mid_album_300/l/o/003y8dsH2wBHlo.jpg
             * albumpic_small : http://i.gtimg.cn/music/photo/mid_album_90/l/o/003y8dsH2wBHlo.jpg
             * downUrl : http://tsmusic24.tc.qq.com/102636799.mp3
             * seconds : 261
             * singerid : 5062
             * singername : 薛之谦
             * songid : 102636799
             * songname : 演员
             * url : http://ws.stream.qqmusic.qq.com/102636799.m4a?fromtag=46
             */

            private ArrayList<SonglistBean> songlist;

            public int getColor() {
                return color;
            }

            public void setColor(int color) {
                this.color = color;
            }

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public int getRet_code() {
                return ret_code;
            }

            public void setRet_code(int ret_code) {
                this.ret_code = ret_code;
            }

            public int getTotal_song_num() {
                return total_song_num;
            }

            public void setTotal_song_num(int total_song_num) {
                this.total_song_num = total_song_num;
            }

            public ArrayList<SonglistBean> getSonglist() {
                return songlist;
            }

            public void setSonglist(ArrayList<SonglistBean> songlist) {
                this.songlist = songlist;
            }

            public static class SonglistBean implements Parcelable {


                protected SonglistBean(Parcel in) {
                    albumid = in.readInt();
                    albummid = in.readString();
                    albumpic_big = in.readString();
                    albumpic_small = in.readString();
                    downUrl = in.readString();
                    seconds = in.readInt();
                    singerid = in.readInt();
                    singername = in.readString();
                    songid = in.readInt();
                    songname = in.readString();
                    url = in.readString();
                }

                public static final Creator<SonglistBean> CREATOR = new Creator<SonglistBean>() {
                    @Override
                    public SonglistBean createFromParcel(Parcel in) {
                        return new SonglistBean(in);
                    }

                    @Override
                    public SonglistBean[] newArray(int size) {
                        return new SonglistBean[size];
                    }
                };

                @Override
                public String toString() {
                    return "SonglistBean{" +
                            "albumid=" + albumid +
                            ", albummid='" + albummid + '\'' +
                            ", albumpic_big='" + albumpic_big + '\'' +
                            ", albumpic_small='" + albumpic_small + '\'' +
                            ", downUrl='" + downUrl + '\'' +
                            ", seconds=" + seconds +
                            ", singerid=" + singerid +
                            ", singername='" + singername + '\'' +
                            ", songid=" + songid +
                            ", songname='" + songname + '\'' +
                            ", url='" + url + '\'' +
                            '}';
                }

                private int albumid;
                private String albummid;
                private String albumpic_big;
                private String albumpic_small;
                private String downUrl;
                private int seconds;
                private int singerid;
                private String singername;
                private int songid;
                private String songname;
                private String url;

                public int getAlbumid() {
                    return albumid;
                }

                public void setAlbumid(int albumid) {
                    this.albumid = albumid;
                }

                public String getAlbummid() {
                    return albummid;
                }

                public void setAlbummid(String albummid) {
                    this.albummid = albummid;
                }

                public String getAlbumpic_big() {
                    return albumpic_big;
                }

                public void setAlbumpic_big(String albumpic_big) {
                    this.albumpic_big = albumpic_big;
                }

                public String getAlbumpic_small() {
                    return albumpic_small;
                }

                public void setAlbumpic_small(String albumpic_small) {
                    this.albumpic_small = albumpic_small;
                }

                public String getDownUrl() {
                    return downUrl;
                }

                public void setDownUrl(String downUrl) {
                    this.downUrl = downUrl;
                }

                public int getSeconds() {
                    return seconds;
                }

                public void setSeconds(int seconds) {
                    this.seconds = seconds;
                }

                public int getSingerid() {
                    return singerid;
                }

                public void setSingerid(int singerid) {
                    this.singerid = singerid;
                }

                public String getSingername() {
                    return singername;
                }

                public void setSingername(String singername) {
                    this.singername = singername;
                }

                public int getSongid() {
                    return songid;
                }

                public void setSongid(int songid) {
                    this.songid = songid;
                }

                public String getSongname() {
                    return songname;
                }

                public void setSongname(String songname) {
                    this.songname = songname;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(albumid);
                    dest.writeString(albummid);
                    dest.writeString(albumpic_big);
                    dest.writeString(albumpic_small);
                    dest.writeString(downUrl);
                    dest.writeInt(seconds);
                    dest.writeInt(singerid);
                    dest.writeString(singername);
                    dest.writeInt(songid);
                    dest.writeString(songname);
                    dest.writeString(url);
                }
            }
        }
    }
}
