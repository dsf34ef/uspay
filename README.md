# U神三方支付系统
[![AUR](https://img.shields.io/badge/GPL-v3-red)]()
[![](https://img.shields.io/badge/Author-US-orange.svg)]()
[![](https://img.shields.io/badge/version-2.0-brightgreen.svg)]()
[![GitHub stars](https://img.shields.io/github/stars/US/USpay.svg?style=social&label=Stars)]
[![GitHub forks](https://img.shields.io/github/forks/US/USpay.svg?style=social&label=Fork)]

U神支付系统 让支付触手可及，封装了QQ，微信，支付宝等原生，同时也有开通了话费慢充，小荷包，零钱，口令
等常用的支付方式以及各种常用的接口。 仅仅作为工具使用简单快速完成支付模块的开发，可轻松嵌入到任何系统
### 声明
> 此系统只针对个人开发学习，禁止商用，各位同学可以当成spring boot 支付练手项目，严禁商用

### 个人申请支付接口现状
- 原生支付宝，微信支付

    - `支付宝微信只服务于有营业执照、个体工商户的商户。截止目前（2020-01-01）无法以个人身份（或以个人为主体）直接申请API。`


- 关联企业支付宝账号

    - `即新建企业账户，然后采用已经实名认证了的企业账户关联该账户，用其实名主体完成新账户的实名认证。一系列操作完成后，新的账户具有和企业账户一样的资质可以申请API。`


- 聚合支付工具，Ping++等

    - `就是个第四方聚合支付工具，简化了接入开发流程而已，个人开发者仍然需要去申请所需接口的使用权限。`


- 第四方聚合支付

    - `支付资金进入官方账号，自己再进行提现操作。需要开通域名，提现手续费较高，支付页面不支持自定义。另外，对于此种类型的聚合支付平台，隐藏着极高的跑路风险。`

- 对接支付
   
   - `QQ，微信，支付宝等原生，同时也有开通了话费慢充，小荷包，零钱，口令，具体自己摸索哟`
- 国外支付，PayPal、Strip：不可用
### USpay
- `支持支付宝、微信、QQ钱包、翼支付、云闪付等任意收款码，资金直接到达本人账号，官方通道自动回调，免签通道个人移动端一键审核即时回调，不需提现，不需备案，完全免费，不干涉监听任何支付数据，个人收款0风险方案（前提正规业务小量金额）`
- 结论：个人收款较少的支付业务推荐使用
### 开发流程原理（以下为免签通道原理，官方通道7*24小时自动回调）
> 最新文档详见源码中的 `文档` 文件夹
