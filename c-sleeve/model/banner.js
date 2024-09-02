import { config } from "../config/config"
import { Http } from "../utils/http"

class Banner{
    static locationB = 'b-1'

    static async getHomeLocationB(){
        return await Http.request({
            url:`banner/name/${Banner.locationB}`
            // data:{
            //     names: locationB
            // }
        })
    }
}

export{
    Banner
}