package com.cxb.familytree.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * 家族人员
 */

public class FamilyMember implements Parcelable {

    private String memberId;//人员ID
    private String memberName;//姓名
    private String call;//称呼
    private String memberImg;//头像

    private FamilyMember spouse;//配偶
    private FamilyMember father;//父亲
    private FamilyMember mother;//母亲
    private FamilyMember fosterFather;//养父
    private FamilyMember fosterMother;//养母

    private List<FamilyMember> brothers;//兄弟姐妹
    private List<FamilyMember> children;//儿女


    private boolean isSelect = false;//是否选中

    public FamilyMember() {

    }

    protected FamilyMember(Parcel in) {
        memberId = in.readString();
        memberName = in.readString();
        call = in.readString();
        memberImg = in.readString();
        spouse = in.readParcelable(FamilyMember.class.getClassLoader());
        father = in.readParcelable(FamilyMember.class.getClassLoader());
        mother = in.readParcelable(FamilyMember.class.getClassLoader());
        fosterFather = in.readParcelable(FamilyMember.class.getClassLoader());
        fosterMother = in.readParcelable(FamilyMember.class.getClassLoader());
        brothers = in.createTypedArrayList(FamilyMember.CREATOR);
        children = in.createTypedArrayList(FamilyMember.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(memberId);
        dest.writeString(memberName);
        dest.writeString(call);
        dest.writeString(memberImg);
        dest.writeParcelable(spouse, flags);
        dest.writeParcelable(father, flags);
        dest.writeParcelable(mother, flags);
        dest.writeParcelable(fosterFather, flags);
        dest.writeParcelable(fosterMother, flags);
        dest.writeTypedList(brothers);
        dest.writeTypedList(children);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<FamilyMember> CREATOR = new Creator<FamilyMember>() {
        @Override
        public FamilyMember createFromParcel(Parcel in) {
            return new FamilyMember(in);
        }

        @Override
        public FamilyMember[] newArray(int size) {
            return new FamilyMember[size];
        }
    };

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getMemberImg() {
        return memberImg;
    }

    public void setMemberImg(String memberImg) {
        this.memberImg = memberImg;
    }

    public FamilyMember getSpouse() {
        return spouse;
    }

    public void setSpouse(FamilyMember spouse) {
        this.spouse = spouse;
    }

    public FamilyMember getFather() {
        return father;
    }

    public void setFather(FamilyMember father) {
        this.father = father;
    }

    public FamilyMember getMother() {
        return mother;
    }

    public void setMother(FamilyMember mother) {
        this.mother = mother;
    }

    public FamilyMember getFosterFather() {
        return fosterFather;
    }

    public void setFosterFather(FamilyMember fosterFather) {
        this.fosterFather = fosterFather;
    }

    public FamilyMember getFosterMother() {
        return fosterMother;
    }

    public void setFosterMother(FamilyMember fosterMother) {
        this.fosterMother = fosterMother;
    }

    public List<FamilyMember> getBrothers() {
        return brothers;
    }

    public void setBrothers(List<FamilyMember> brothers) {
        this.brothers = brothers;
    }

    public List<FamilyMember> getChildren() {
        return children;
    }

    public void setChildren(List<FamilyMember> children) {
        this.children = children;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }
}
