package com.example.administrator.lesson19_javaconnection;

import java.util.List;

public class Joke {
    /**
     * allNum : 35331
     * allPages : 1767
     * contentlist : [{"ct":"2016-11-14 11:02:22.676","id":"5829293e6e3681d219e2531c","img":"http://sc4.hao123img.com/data/2016-11-14/3_1ac97e5528351f97995999a3fad65b16_430","title":"内心住着个小公举","type":2},{"ct":"2016-11-14 11:02:22.007","id":"5829293e6e3681d219e2531a","img":"http://sc0.hao123img.com/data/2016-11-14/3_2b0da8e6781220a69e0258f2e16abaa8_430","title":"电脑桌面重要文件提醒","type":2},{"ct":"2016-11-14 10:35:06.358","id":"582922da6e3681d219e1e72c","img":"http://sc4.hao123img.com/data/2016-11-14/3_4231d68a26a3b503047034d823bc8d98_0","title":"少一点套路，多一点真诚","type":2},{"ct":"2016-11-14 10:35:06.360","id":"582922da6e3681d219e1e72b","img":"http://sc0.hao123img.com/data/2016-11-14/3_3f267645c23a4722ad05b079bc21f635_430","title":"万圣节结束了，过气南瓜不如鸡","type":2},{"ct":"2016-11-14 10:35:06.359","id":"582922da6e3681d219e1e72a","img":"http://sc1.hao123img.com/data/2016-11-14/3_4c185a2cef39c29c985caa7c38dee602_430","title":"siri说相声去吧","type":2},{"ct":"2016-11-14 10:30:52.873","id":"582921dc6e3681d219e1cfe4","img":"http://www.zbjuran.com/uploads/allimg/161114/10-161114101144228.jpg","title":"商家的智慧是无穷的。","type":2},{"ct":"2016-11-14 10:30:47.942","id":"582921d76e3681d219e1cfcf","img":"http://www.zbjuran.com/uploads/allimg/161114/10-16111410020a20.jpg","title":"美女，你的手好像放错地方了","type":2},{"ct":"2016-11-14 10:00:20.400","id":"58291ab46e3669833c2119fb","img":"http://www.zbjuran.com/uploads/allimg/161114/10-161114095010611.jpg","title":"很贴心，没毛病！","type":2},{"ct":"2016-11-14 09:31:07.912","id":"582913db6e3669833c20baeb","img":"http://www.zbjuran.com/uploads/allimg/161114/10-16111409264X36.jpg","title":"一进电梯差点吓尿了。","type":2},{"ct":"2016-11-14 09:31:06.988","id":"582913da6e3669833c20bae8","img":"http://www.zbjuran.com/uploads/allimg/161114/10-16111409163M42.jpg","title":"死了也要蹦迪","type":2},{"ct":"2016-11-14 09:31:06.989","id":"582913da6e3669833c20bae7","img":"http://www.zbjuran.com/uploads/allimg/161114/10-1611140Z95a11.jpg","title":"妈蛋，几点了还不起来给老子弄吃的！","type":2},{"ct":"2016-11-14 09:31:06.988","id":"582913da6e3669833c20bae5","img":"http://www.zbjuran.com/uploads/allimg/161114/10-161114092235545.jpg","title":"听说这里面藏着一只狗\u2026\u2026","type":2},{"ct":"2016-11-14 09:31:06.988","id":"582913da6e3669833c20bae4","img":"http://www.zbjuran.com/uploads/allimg/161114/10-1611140ZHI45.jpg","title":"哈哈哈，还真的像","type":2},{"ct":"2016-11-14 04:00:39.776","id":"5828c6676e3669833c1ee748","img":"http://sc2.hao123img.com/data/2016-11-14/3_b740811f7cb8a0876c3e9f9c4f7563bb_430","title":"你这是在抠什么呢？","type":2},{"ct":"2016-11-14 03:31:31.389","id":"5828bf936e3669833c1ee0be","img":"http://sc0.hao123img.com/data/2016-11-13/3_4c45892e538ccd503c0c692cffd9bf72_430","title":"尼玛！这特么就是一宅神啊！","type":2},{"ct":"2016-11-14 03:00:26.210","id":"5828b84a6e3669833c1ec5b1","img":"http://sc1.hao123img.com/data/2016-11-13/3_7d2581de397c6232941b1156544c85a8_430","title":"汪：双11想要个像样的狗窝","type":2},{"ct":"2016-11-14 02:00:54.571","id":"5828aa566e3669833c1e8b5e","img":"http://sc4.hao123img.com/data/2016-11-13/3_c99e378a42fdb05b616a06ae965a8954_430","title":"一毛一样，终于找到原型了","type":2},{"ct":"2016-11-14 01:30:52.121","id":"5828a34c6e3669833c1e8318","img":"http://sc1.hao123img.com/data/2016-11-14/3_6eaeea910f80e79bbbb575754ef0af72_430","title":"听说顺丰包了高铁，可以这很顺丰。","type":2},{"ct":"2016-11-14 01:30:52.121","id":"5828a34c6e3669833c1e8317","img":"http://sc4.hao123img.com/data/2016-11-13/3_e92be5bdfb81db571f6a4a6af5b1774e_430","title":"老师大吼：草！病毒！！！","type":2},{"ct":"2016-11-14 01:30:52.118","id":"5828a34c6e3669833c1e8311","img":"http://sc3.hao123img.com/data/2016-11-14/3_d1f9d8178b0a05dca338a1edb3dd9ce6_430","title":"吃这事，该撕，别将就！","type":2}]
     * currentPage : 1
     * maxResult : 20
     * ret_code : 0
     */

    private ShowapiResBodyBean showapi_res_body;
    /**
     * showapi_res_body : {"allNum":35331,"allPages":1767,"contentlist":[{"ct":"2016-11-14 11:02:22.676","id":"5829293e6e3681d219e2531c","img":"http://sc4.hao123img.com/data/2016-11-14/3_1ac97e5528351f97995999a3fad65b16_430","title":"内心住着个小公举","type":2},{"ct":"2016-11-14 11:02:22.007","id":"5829293e6e3681d219e2531a","img":"http://sc0.hao123img.com/data/2016-11-14/3_2b0da8e6781220a69e0258f2e16abaa8_430","title":"电脑桌面重要文件提醒","type":2},{"ct":"2016-11-14 10:35:06.358","id":"582922da6e3681d219e1e72c","img":"http://sc4.hao123img.com/data/2016-11-14/3_4231d68a26a3b503047034d823bc8d98_0","title":"少一点套路，多一点真诚","type":2},{"ct":"2016-11-14 10:35:06.360","id":"582922da6e3681d219e1e72b","img":"http://sc0.hao123img.com/data/2016-11-14/3_3f267645c23a4722ad05b079bc21f635_430","title":"万圣节结束了，过气南瓜不如鸡","type":2},{"ct":"2016-11-14 10:35:06.359","id":"582922da6e3681d219e1e72a","img":"http://sc1.hao123img.com/data/2016-11-14/3_4c185a2cef39c29c985caa7c38dee602_430","title":"siri说相声去吧","type":2},{"ct":"2016-11-14 10:30:52.873","id":"582921dc6e3681d219e1cfe4","img":"http://www.zbjuran.com/uploads/allimg/161114/10-161114101144228.jpg","title":"商家的智慧是无穷的。","type":2},{"ct":"2016-11-14 10:30:47.942","id":"582921d76e3681d219e1cfcf","img":"http://www.zbjuran.com/uploads/allimg/161114/10-16111410020a20.jpg","title":"美女，你的手好像放错地方了","type":2},{"ct":"2016-11-14 10:00:20.400","id":"58291ab46e3669833c2119fb","img":"http://www.zbjuran.com/uploads/allimg/161114/10-161114095010611.jpg","title":"很贴心，没毛病！","type":2},{"ct":"2016-11-14 09:31:07.912","id":"582913db6e3669833c20baeb","img":"http://www.zbjuran.com/uploads/allimg/161114/10-16111409264X36.jpg","title":"一进电梯差点吓尿了。","type":2},{"ct":"2016-11-14 09:31:06.988","id":"582913da6e3669833c20bae8","img":"http://www.zbjuran.com/uploads/allimg/161114/10-16111409163M42.jpg","title":"死了也要蹦迪","type":2},{"ct":"2016-11-14 09:31:06.989","id":"582913da6e3669833c20bae7","img":"http://www.zbjuran.com/uploads/allimg/161114/10-1611140Z95a11.jpg","title":"妈蛋，几点了还不起来给老子弄吃的！","type":2},{"ct":"2016-11-14 09:31:06.988","id":"582913da6e3669833c20bae5","img":"http://www.zbjuran.com/uploads/allimg/161114/10-161114092235545.jpg","title":"听说这里面藏着一只狗\u2026\u2026","type":2},{"ct":"2016-11-14 09:31:06.988","id":"582913da6e3669833c20bae4","img":"http://www.zbjuran.com/uploads/allimg/161114/10-1611140ZHI45.jpg","title":"哈哈哈，还真的像","type":2},{"ct":"2016-11-14 04:00:39.776","id":"5828c6676e3669833c1ee748","img":"http://sc2.hao123img.com/data/2016-11-14/3_b740811f7cb8a0876c3e9f9c4f7563bb_430","title":"你这是在抠什么呢？","type":2},{"ct":"2016-11-14 03:31:31.389","id":"5828bf936e3669833c1ee0be","img":"http://sc0.hao123img.com/data/2016-11-13/3_4c45892e538ccd503c0c692cffd9bf72_430","title":"尼玛！这特么就是一宅神啊！","type":2},{"ct":"2016-11-14 03:00:26.210","id":"5828b84a6e3669833c1ec5b1","img":"http://sc1.hao123img.com/data/2016-11-13/3_7d2581de397c6232941b1156544c85a8_430","title":"汪：双11想要个像样的狗窝","type":2},{"ct":"2016-11-14 02:00:54.571","id":"5828aa566e3669833c1e8b5e","img":"http://sc4.hao123img.com/data/2016-11-13/3_c99e378a42fdb05b616a06ae965a8954_430","title":"一毛一样，终于找到原型了","type":2},{"ct":"2016-11-14 01:30:52.121","id":"5828a34c6e3669833c1e8318","img":"http://sc1.hao123img.com/data/2016-11-14/3_6eaeea910f80e79bbbb575754ef0af72_430","title":"听说顺丰包了高铁，可以这很顺丰。","type":2},{"ct":"2016-11-14 01:30:52.121","id":"5828a34c6e3669833c1e8317","img":"http://sc4.hao123img.com/data/2016-11-13/3_e92be5bdfb81db571f6a4a6af5b1774e_430","title":"老师大吼：草！病毒！！！","type":2},{"ct":"2016-11-14 01:30:52.118","id":"5828a34c6e3669833c1e8311","img":"http://sc3.hao123img.com/data/2016-11-14/3_d1f9d8178b0a05dca338a1edb3dd9ce6_430","title":"吃这事，该撕，别将就！","type":2}],"currentPage":1,"maxResult":20,"ret_code":0}
     * showapi_res_code : 0
     * showapi_res_error :
     */

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
        private int allNum;
        private int allPages;
        private int currentPage;
        private int maxResult;
        private int ret_code;
        /**
         * ct : 2016-11-14 11:02:22.676
         * id : 5829293e6e3681d219e2531c
         * img : http://sc4.hao123img.com/data/2016-11-14/3_1ac97e5528351f97995999a3fad65b16_430
         * title : 内心住着个小公举
         * type : 2
         */
        private List<ContentlistBean> contentlist;

        public int getAllNum() {
            return allNum;
        }

        public void setAllNum(int allNum) {
            this.allNum = allNum;
        }

        public int getAllPages() {
            return allPages;
        }

        public void setAllPages(int allPages) {
            this.allPages = allPages;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getMaxResult() {
            return maxResult;
        }

        public void setMaxResult(int maxResult) {
            this.maxResult = maxResult;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public List<ContentlistBean> getContentlist() {
            return contentlist;
        }

        public void setContentlist(List<ContentlistBean> contentlist) {
            this.contentlist = contentlist;
        }

        public static class ContentlistBean {
            private String ct;
            private String id;
            private String img;
            private String title;
            private int type;

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
