package kr.co.data.response

import com.fasterxml.jackson.annotation.JsonProperty
import kr.co.data.entity.FileDataList

data class FileResponse(
    @JsonProperty("status") var status:String,
    @JsonProperty("datas") var datas: FileDataList,
    @JsonProperty("message") var message: String
)