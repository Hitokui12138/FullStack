import { config } from "../config/config";
import { promisic } from "./util";

class Http{
    //现在可以看做是一个同步函数
    static async request({url, data, method='GET'}){
        const res = await promisic(wx.request)({
            url: `${config.apiBaseUrl}${url}`,
            data,
            method,
            header:{
                appkey: config.appkey
            }
        })
        //这个和api提供的数据结构有关
        return res.data
    }
}

export{
    Http
}