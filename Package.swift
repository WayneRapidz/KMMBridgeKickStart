// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/WayneRapidz/KMMBridgeKickStart/io/rapidz/kmmbridgekickstart/allshared-kmmbridge/0.2.6/allshared-kmmbridge-0.2.6.zip"
let remoteKotlinChecksum = "09a652ff2f13d1d5ed74f49db2859b2696b69e53a978694917ec74e54cdf03b3"
let packageName = "allshared"

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)