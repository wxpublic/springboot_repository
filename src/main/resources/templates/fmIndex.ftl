这是我的第一个FreeMarker项目
<table>
    <tr>
        <td>Name:</td>
        <td>
           ${name}
        </td>
    </tr>
    <tr>
        <td>Age:</td>
        <td>
            ${age}
        </td>
    </tr>
    <tr>
        <td>Sex:</td>
        <td>
            <#if sex == 0>
                我是男孩子
            <#else >
                我是女孩子
            </#if>
        </td>
    </tr>
</table>
