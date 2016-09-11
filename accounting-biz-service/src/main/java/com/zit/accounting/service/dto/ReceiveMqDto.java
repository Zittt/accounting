package com.zit.accounting.service.dto;

/**
 * Created by zhou on 2016/9/10.
 */
public class ReceiveMqDto {
    private InnerInfo params;

    public InnerInfo getParams() {
        return params;
    }

    public void setParams(InnerInfo params) {
        this.params = params;
    }

    public class InnerInfo {

        private int id;

        private String name;

        private String data;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}
