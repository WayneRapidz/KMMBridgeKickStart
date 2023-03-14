// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/WayneRapidz/KMMBridgeKickStart/io/rapidz/kmmbridgekickstart/allshared-kmmbridge/0.2.2/allshared-kmmbridge-0.2.2.zip"
let remoteKotlinChecksum = "b57f3d20a8155b6f0deb2f5e5154297e220875f02958947606201291ad4de8c3"
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