// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/WayneRapidz/KMMBridgeKickStart/io/rapidz/kmmbridgekickstart/allshared-kmmbridge/0.2.11/allshared-kmmbridge-0.2.11.zip"
let remoteKotlinChecksum = "13c79bff9b8feefd5bed0265a76f3094770aebb1449ea0e08c90f3e86445f43f"
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