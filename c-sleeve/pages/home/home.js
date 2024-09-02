// pages/home/home.js
import { config } from "../../config/config";
import { Banner } from "../../model/banner";
import { Category } from "../../model/category";
import { Theme } from "../../model/theme";

Page({

  /**
   * 页面的初始数据
   */
  data: {
    themeA:null,
    bannerB:null,
    // grid是个数组
    grid:[]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  async onLoad(options) {
    this.initAllData()
  },

  //ES6:自定义一个方法
  async initAllData(){
    console.log("正在读取数据..")
    const data = await Theme.getHomeLocationA()
    const bannerB = await Banner.getHomeLocationB()
    const grid = await Category.getGridCategory()
    
    this.setData({
      themeA: data[0],
      bannerB: bannerB,
      grid: grid
    })
    console.log(grid)
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage() {

  }
})